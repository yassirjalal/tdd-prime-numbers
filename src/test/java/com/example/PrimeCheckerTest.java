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
    @ValueSource(ints = {2, 3})
    public void testPrimeNumbers(int number) {
        assertTrue(primeChecker.isPrime(number), number + " should be considered a prime number");
    }

    @Test
    public void test4IsNotPrime() {
        assertFalse(primeChecker.isPrime(4), "4 should not be considered a prime number");
    }

    @Test
    public void test5IsPrime() {
        assertTrue(primeChecker.isPrime(5), "5 should be considered a prime number");
    }
}
