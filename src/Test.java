import java.util.List;

public class Test {
    public void testIsPrime() {
        System.out.println("----------------isPrime-------------------");
        PrimeGenerator pg = new PrimeGenerator();

        boolean test_0 = pg.isPrime(0);
        boolean test_1 = pg.isPrime(1);
        boolean test_4 = pg.isPrime(4);
        System.out.println(test_0); //false
        System.out.println(test_1); //false
        System.out.println(test_4); //false

        boolean test_2 = pg.isPrime(2);
        boolean test_7919 = pg.isPrime(7919);
        System.out.println(test_2); //true
        System.out.println(test_7919); //true
    }

    public void testGenerate() {
        System.out.println("----------------generate-------------------");
        PrimeGenerator pg = new PrimeGenerator();
        UpdoxPrimeGenerator upg = new UpdoxPrimeGenerator();

        List test_1_1 = pg.generate(1, 1); // No Prime
        List test_N1_1 = pg.generate(-1, 1); // No Prime
        upg.displayPrimeNumbers(test_1_1);
        upg.displayPrimeNumbers(test_N1_1);

        List test_N1_2 = pg.generate(-1, 2); // 2
        upg.displayPrimeNumbers(test_N1_2);

        List test_2_2 = pg.generate(2, 2); // 2
        upg.displayPrimeNumbers(test_2_2);

        List test_N50_7 = pg.generate(-50, 7); // 2 3 5 7
        List test_7_N50 = pg.generate(7, -50); // 2 3 5 7
        upg.displayPrimeNumbers(test_N50_7);
        upg.displayPrimeNumbers(test_7_N50);

        List test_2_7 = pg.generate(2, 7); // 2 3 5 7
        List test_0_101 = pg.generate(0, 101); // first 26 primes
        List test_7900_7920 = pg.generate(7900, 7920); //7901 7907 7919
        upg.displayPrimeNumbers(test_2_7);
        upg.displayPrimeNumbers(test_0_101);
        upg.displayPrimeNumbers(test_7900_7920);
    }


}
