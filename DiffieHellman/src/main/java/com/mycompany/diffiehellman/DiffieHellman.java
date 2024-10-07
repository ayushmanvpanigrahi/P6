package com.mycompany.diffiehellman;

public class DiffieHellman {

    private static long power(long a, long b, long p) {
        if (b == 1) {
            return a;
        } else {
            return (((long) Math.pow(a, b)) % p);
        }
    }

    public static void main(String[] args) {
        long n, g, x, A, y, B, Ka, Kb;
        n = 11;
        System.out.println("The value of N : " + n);
        g = 7;
        System.out.println("The value of g : " + g);
        x = 3;
        System.out.println("The private key for Alice : " + x);
        A = power(g, x, n);
        System.out.println("Value of A --> " + A);
        y = 6;
        System.out.println("The private key for Bob : " + y);
        B = power(g, y, n);
        System.out.println("Value of B --> " + B);
        Ka = power(B, x, n);
        Kb = power(A, y, n);
        System.out.println("Secret key for Alice is : " + Ka);
        System.out.println("Secret key for Bob is : " + Kb);
    }
}
