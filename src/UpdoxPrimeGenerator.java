import java.util.List;
import java.util.Scanner;

public class UpdoxPrimeGenerator implements PrimeNumberGenerator {

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updox Prime Generator");
        System.out.println("----------------------------------------------");
        System.out.println("Enter inclusive starting endpoint:");
        int first = scanner.nextInt();
        System.out.println("Enter inclusive ending endpoint:");
        int second = scanner.nextInt();
        generate(first, second);
    }

    @Override
    public boolean isPrime(int value) {
        return false;
    }

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        System.out.println(startingValue + " " + endingValue);
        return null;
    }
}
