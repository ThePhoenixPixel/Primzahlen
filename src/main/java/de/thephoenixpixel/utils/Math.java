package de.thephoenixpixel.utils;

public class Math {
    
    public static boolean isPrime(int n) {
        // check ob zahl pime is
        int teiler = 0;

        for (int i = 1; i <= n;) {
            if (n % i == 0) {
                teiler++;
            }
            i++;
        }
        return teiler == 2;
    }
    
}
