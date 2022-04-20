import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator implements PrimeNumberGenerator {

    /* Implemented for interface, not used in solution.
     *  This public method is kept modular. */
    @Override
    public boolean isPrime(int value) {
        if (value <= 1)
            return false;

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    /* Generates order list of primes numbers form an inclusive range using
     * Segment of Sieve of Eratothenes Algorithm*/
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {

        if (isDescending(startingValue, endingValue)) {
            var temp = startingValue;
            startingValue = endingValue;
            endingValue = temp;
        }

        if (isLessThanFirstPrime(endingValue))
            return new ArrayList<>();
        if (isLessThanFirstPrime(startingValue))
            startingValue = 2;

        ArrayList<Integer> initialPrimes = fillInitialPrimes(endingValue);
        boolean[] composites = new boolean[endingValue - startingValue + 1];

        //Set multiples of primes' composites to true
        for (var prime : initialPrimes) {
            int firstMultiple = findNextMultipleOf(prime, startingValue);
            for (int j = firstMultiple; j <= endingValue; j = j + prime) {
                composites[j - startingValue] = true;
            }
        }

        //Add Primes
        List<Integer> primes = new ArrayList<>();
        for (int i = startingValue; i <= endingValue; i++) {
            if (!composites[i - startingValue]) {
                primes.add(i);
            }
        }

        return primes;
    }

    //Implementation
    /* Built for readability/expressiveness */
    private boolean isDescending(int first, int second) {
        return first > second;
    }

    private boolean isLessThanFirstPrime(int integer) {
        return integer <= 1;
    }

    /* Fills list of initial primes to start Sieve */
    private ArrayList<Integer> fillInitialPrimes(int end) {
        //Set flags for composites/primes
        boolean[] composites = new boolean[end + 1];
        for (int i = 2; (i * i) <= end; i++) {
            if (!composites[i]) {
                for (int j = i * i; j <= Math.sqrt(end); j = j + i)
                    composites[j] = true;
            }
        }
        //Add Primes
        ArrayList<Integer> initialPrimes = new ArrayList<>();
        for (int i = 2; i * i <= end; i++) {
            if (!composites[i])
                initialPrimes.add(i);
        }

        return initialPrimes;
    }

    /* Used for filling out composite/prime flags in range */
    private int findNextMultipleOf(int integer, int prev) {
        int firstMultiple = (prev / integer);

        if (firstMultiple <= 1)
            firstMultiple = integer + integer;
        else if (prev % integer != 0)
            firstMultiple = (firstMultiple * integer) + integer;
        else
            firstMultiple = (firstMultiple * integer);

        return firstMultiple;
    }
}
