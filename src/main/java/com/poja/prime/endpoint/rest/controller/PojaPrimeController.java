package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.PojaGenerated;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@PojaGenerated
@RestController
@Value
public class PojaPrimeController {
    @GetMapping("/new-prime")
    public static BigInteger generateProbablePrime() {
        BigInteger probablePrime = BigInteger.probablePrime(10000, java.util.concurrent.ThreadLocalRandom.current());
        return probablePrime;
    }
}
