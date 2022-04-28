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
}