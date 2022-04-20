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

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primes = new ArrayList<>();
        //return correct empty list of found primes
        if(endingValue <= 1)
            return primes;
        //optimize to first prime
        if(startingValue <= 1)
            startingValue =2;

        //Create initialPrimes to start Sieve
        ArrayList<Integer> initialPrimes = new ArrayList<>();
        boolean[] initialComposites = new boolean[endingValue+1];

        //set flags for composites/primes
        for(int i=2;(i*i)<=endingValue;i++) {
            if(!initialComposites[i]) {
                for(int j=i*i;j<=Math.sqrt(endingValue);j=j+i)
                    initialComposites[j]=true;
            }
        }
        //Add Primes
        for(int i=2;i*i<=endingValue;i++) {
            if(!initialComposites[i])
                initialPrimes.add(i);
        }

        for(var prime : initialPrimes)
            System.out.println(prime);//TODO: Remove

        return primes;
    }



}
