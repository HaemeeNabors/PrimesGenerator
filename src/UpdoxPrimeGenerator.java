import java.util.List;

public class UpdoxPrimeGenerator implements PrimeNumberGenerator {

    public void start(){
        System.out.println("Updox Prime Generator");
    }

    @Override
    public boolean isPrime(int value) {
        return false;
    }

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        return null;
    }
}
