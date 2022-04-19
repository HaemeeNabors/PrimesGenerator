import java.util.List;

public interface PrimeNumberGenerator {
    boolean isPrime(int value);
    List<Integer> generate(int startingValue, int endingValue);
}
