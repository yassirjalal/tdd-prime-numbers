package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    public void testNumbersLessThan2AreNotPrime(int number) {
        assertFalse(primeChecker.isPrime(number), number + " should not be considered a prime number");
    }

    @ParameterizedTest
    @ValueSource(ints = {4})
    public void testCompositeNumbersAreNotPrime(int number) {
        assertFalse(primeChecker.isPrime(number), number + " should not be considered a prime number");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5})
    public void testPrimeNumbers(int number) {
        assertTrue(primeChecker.isPrime(number), number + " should be considered a prime number");
    }

    @Test
    public void test6IsNotPrime() {
        assertFalse(primeChecker.isPrime(6), "6 should not be considered a prime number");
    }

    @Test
    public void test7IsPrime() {
        assertTrue(primeChecker.isPrime(7), "7 should be considered a prime number");
    }

    @Test
    public void test8IsNotPrime() {
        assertFalse(primeChecker.isPrime(8), "8 should not be considered a prime number");
    }

    @Test
    public void test9IsNotPrime() {
        assertFalse(primeChecker.isPrime(9), "9 should not be considered a prime number");
    }
}
