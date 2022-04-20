import java.util.List;

public class PrimeGenerator implements PrimeNumberGenerator {

    @Override
    public boolean isPrime(int value) {
        return false;
    }

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        System.out.println(startingValue + " " + endingValue); //remove
        return null;
    }


}
