package com.example;

public class PrimeChecker {

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        return number % 2 != 0;
    }

}
