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

        //A segment of Sieve of Eratosthenes
        //initial primes to compare segment to
        //compare range/segment

        //add to primes
        primes.add(-1);//remove-----
        return primes;
    }


}
