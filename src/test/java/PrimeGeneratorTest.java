package test.java;

import main.java.PrimeGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class PrimeGeneratorTest {

    //isPrime()
    @Test
    void zeroShouldReturnFalse() {
        var pg = new PrimeGenerator();
        Assertions.assertFalse(pg.isPrime(0));
    }

    @Test
    void oneShouldReturnFalse() {
        var pg = new PrimeGenerator();
        Assertions.assertFalse(pg.isPrime(1));
    }

    @Test
    void fourShouldReturnFalse() {
        var pg = new PrimeGenerator();
        Assertions.assertFalse(pg.isPrime(4));
    }

    @Test
    void twoShouldReturnTrue() {
        var pg = new PrimeGenerator();
        Assertions.assertTrue(pg.isPrime(2));
    }

    @Test
    void _7919ShouldReturnTrue() {
        var pg = new PrimeGenerator();
        Assertions.assertTrue(pg.isPrime(7919));
    }

    //.generate() end-to-end testing
    @Test
    void rangeN1To1ShouldReturnEmptyList() {
        var pg = new PrimeGenerator();
        Assertions.assertTrue(pg.generate(-1, 1).isEmpty());
    }

    @Test
    void range1To1ShouldReturnEmptyList() {
        var pg = new PrimeGenerator();
        Assertions.assertTrue(pg.generate(1, 1).isEmpty());
    }

    @Test
    void rangeN1To1ShouldReturn2() {
        var pg = new PrimeGenerator();
        var expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        Assertions.assertFalse(pg.generate(-1, 2).isEmpty());
        Assertions.assertEquals(expectedList, pg.generate(-1, 2));
    }

    @Test
    void range2To2ShouldReturn2() {
        var pg = new PrimeGenerator();
        var expectedList = new ArrayList<>();
        expectedList.add(2);
        Assertions.assertFalse(pg.generate(2, 2).isEmpty());
        Assertions.assertEquals(expectedList, pg.generate(2, 2));
    }

    @Test
    void inverseRangesShouldBeEqual() {
        var pg = new PrimeGenerator();
        Assertions.assertEquals(pg.generate(-50, 7), pg.generate(7, -50));
    }

    @Test
    void range0To102ShouldReturnFirstTwentySixPrimes() {
        var pg = new PrimeGenerator();
        var firstTwentySixPrimes = new ArrayList<>(
                Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
                ));
        Assertions.assertEquals(firstTwentySixPrimes, pg.generate(0, 102));
    }

    @Test
    void range7900To7920ShouldReturn7901_7900_7920() {
        var pg = new PrimeGenerator();
        var expectedList = new ArrayList<>(Arrays.asList(7901, 7907, 7919));
        Assertions.assertEquals(expectedList, pg.generate(7900, 7920));
    }

    //isDescending()
    @Test
    void isDescending_ShouldReturnFalse_WhenOneToFour(){
        var pg = new PrimeGenerator();
        Assertions.assertFalse(pg.isDescending(1, 4));
    }
    @Test
    void isDescending_ShouldReturnFalse_WhenOneToOne(){
        var pg = new PrimeGenerator();
        Assertions.assertFalse(pg.isDescending(1, 1));
    }
    @Test
    void isDescending_ShouldReturnTrue_WhenFourToOne(){
        var pg = new PrimeGenerator();
        Assertions.assertTrue(pg.isDescending(4, 1));
    }

    //isLessThanFirstPrime()
    @Test
    void isLessThanFirstPrime_ShouldReturnTrue_WhenZero(){
        var pg = new PrimeGenerator();
        Assertions.assertTrue(pg.isLessThanFirstPrime(0));
    }

    @Test
    void isLessThanFirstPrime_ShouldReturnTrue_WhenOne(){
        var pg = new PrimeGenerator();
        Assertions.assertTrue(pg.isLessThanFirstPrime(1));
    }

    @Test
    void isLessThanFirstPrime_ShouldReturnFalse_WhenTwo(){
        var pg = new PrimeGenerator();
        Assertions.assertFalse(pg.isLessThanFirstPrime(2));
    }

    @Test
    void isLessThanFirstPrime_ShouldReturnFalse_WhenThree(){
        var pg = new PrimeGenerator();
        Assertions.assertFalse(pg.isLessThanFirstPrime(3));
    }

    //fillInitialPrimes()
    @Test
    void fillInitialPrimes_ShouldEmptyList_When3(){
        var pg = new PrimeGenerator();
        Assertions.assertTrue(pg.fillInitialPrimes(3).isEmpty());
    }

    @Test
    void fillInitialPrimes_Should2_When4(){
        var pg = new PrimeGenerator();
        var expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        for(var prime: expectedList)
            Assertions.assertTrue(pg.isPrime(prime));
        Assertions.assertEquals(expectedList, pg.fillInitialPrimes(4));
    }

    @Test
    void fillInitialPrimes_ShouldReturn2_3_When10(){
        var pg = new PrimeGenerator();
        var expectedList = new ArrayList<>(Arrays.asList(2,3));
        for(var prime: expectedList)
            Assertions.assertTrue(pg.isPrime(prime));
        Assertions.assertEquals(expectedList, pg.fillInitialPrimes(10));
    }

    //findNextMultipleOf()
    @Test
    void findNextMultipleOf_ShouldReturn4_When2_3(){
        var pg = new PrimeGenerator();
        Assertions.assertEquals(4,pg.findNextMultipleOf(2,3));
    }
    @Test
    void findNextMultipleOf_ShouldReturn24_When2_23(){
        var pg = new PrimeGenerator();
        Assertions.assertEquals(24,pg.findNextMultipleOf(2,23));
    }

    @Test
    void findNextMultipleOf_ShouldReturn22_When2_22(){
        var pg = new PrimeGenerator();
        Assertions.assertEquals(22,pg.findNextMultipleOf(2,22));
    }
}