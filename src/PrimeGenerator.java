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
        System.out.println(startingValue + " " + endingValue); //remove
        return null;
    }


}
