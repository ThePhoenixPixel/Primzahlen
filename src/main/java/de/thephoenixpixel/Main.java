package de.thephoenixpixel;

import java.util.ArrayList;
import java.util.List;

import static de.thephoenixpixel.utils.Math.isPrime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Primezahlen Rechner");

        // start the panel
        new Panel();
    }

    public static List<Integer> caculatePrimes(int zahl) {
        // create a list of primes
        List<Integer> primes = new ArrayList<>();

        // got from 2 to input
        for (int i = 2; i <= zahl; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

}