package com.poja.prime.endpoint;

import java.math.BigInteger;

public class PojaPrime {
    public static BigInteger generateProbablePrime() {
        BigInteger probablePrime = BigInteger.probablePrime(10000, java.util.concurrent.ThreadLocalRandom.current());
        return probablePrime;
    }

    public static void main(String[] args) {
        System.out.println(generateProbablePrime());
    }
}
