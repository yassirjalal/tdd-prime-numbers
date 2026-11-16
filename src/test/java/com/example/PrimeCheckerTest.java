package com.example;

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
    @ValueSource(ints = {
                4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25,
                26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45,
                46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63, 64,
                65, 66, 68, 69, 70, 72, 74, 75, 76, 77, 78, 80, 81, 82, 84,
                85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 98, 99, 100})
    public void testCompositeNumbersAreNotPrime(int number) {
        assertFalse(primeChecker.isPrime(number), number + " should not be considered a prime number");
    }

    @ParameterizedTest
    @ValueSource(ints = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97})
    public void testPrimeNumbers(int number) {
        assertTrue(primeChecker.isPrime(number), number + " should be considered a prime number");
    }
}
