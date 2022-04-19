import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UpdoxPrimeGenerator implements PrimeNumberGenerator {

    public void start(){
        displayTitle();

        int[] range = getRange();
        ascendRange(range);

        generate(range[0], range[1]);
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

    //implementation
    private void displayTitle(){
        System.out.println("\n----------------Updox Prime Generator--------------");
        System.out.println("Displays ordered list of primes from entered range.");
        System.out.println("---------------------------------------------------\n");
    }

    private int[] getRange(){
        Scanner scanner = new Scanner(System.in);
        int[] range = new int[2];

        System.out.println("Enter inclusive starting endpoint:");
        range[0] = scanner.nextInt();
        System.out.println("Enter inclusive ending endpoint:");
        range[1] = scanner.nextInt();

        return range;
    }

    private void ascendRange(int[] range){
        Arrays.sort(range);
    }
}
