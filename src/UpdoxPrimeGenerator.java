import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UpdoxPrimeGenerator {
    PrimeGenerator primeGenerator = new PrimeGenerator();

    /* Initial Start */
    public void start() {
        displayTitle();

        var range = getIntegerRange();
        ascendRange(range);

        var primes = primeGenerator.generate(range[0], range[1]);
        displayPrimeNumbers(primes);
    }

    /* Displays Prime Numbers */
    public void displayPrimeNumbers(List<Integer> primes){
        System.out.println("Prime Numbers: ");
        if(primes.isEmpty()) {
            System.out.println("No Prime numbers found.");
            return;
        }
        for(var prime: primes)
            System.out.print(prime + " ");
        System.out.println();
    }

    //implementation
    /* Displays title and description */
    private void displayTitle() {
        System.out.println("\n----------------Updox Prime Generator--------------");
        System.out.println("Displays ordered list of primes from entered range.");
        System.out.println("---------------------------------------------------\n");
    }

    /* Retrieve Integer Range from user*/
    private int[] getIntegerRange() {
        Scanner scanner = new Scanner(System.in);
        int[] range = new int[2];

        System.out.println("Enter inclusive starting integer:");
        range[0] = scanner.nextInt();
        System.out.println("Enter inclusive ending integer:");
        range[1] = scanner.nextInt();

        return range;
    }

    /* Sorts range to ascending (start - end) */
    private void ascendRange(int[] range) {
        Arrays.sort(range);
    }
}
