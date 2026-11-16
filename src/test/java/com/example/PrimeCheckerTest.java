package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void test0IsNotPrime() {
        assertFalse(primeChecker.isPrime(0), "0 should not be considered a prime number");
    }

    @Test
    public void test1IsNotPrime() {
        assertFalse(primeChecker.isPrime(1), "1 should not be considered a prime number");
    }

    @Test
    public void test2IsPrime() {
        assertTrue(primeChecker.isPrime(2), "2 should be considered a prime number");
    }
}
