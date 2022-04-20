public class Test {
    public void testIsPrime(){
        System.out.println("----------------isPrime-------------------");
        PrimeGenerator pg = new PrimeGenerator();

        boolean test_0 = pg.isPrime(0);
        boolean test_1 = pg.isPrime(1);
        boolean test_2 = pg.isPrime(2);
        boolean test_4 = pg.isPrime(4);
        boolean test_7919 = pg.isPrime(7919);

        System.out.println(test_0); //false
        System.out.println(test_1); //false
        System.out.println(test_4); //false
        System.out.println(test_2); //true
        System.out.println(test_7919); //true
    }


}
