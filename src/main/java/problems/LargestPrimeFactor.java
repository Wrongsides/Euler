package problems;

import java.math.BigInteger;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestPrimeFactor {

    public BigInteger findLargestPrimeFactorOf(BigInteger number) {
        Stream<BigInteger> bigIntStream = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE)).limit(number.longValue() - 1L);
        BigInteger lastPrime = bigIntStream.filter(i -> number.mod(i).equals(BigInteger.ZERO))
                                .filter(this::isPrime)
                                .reduce((a,b) -> b)
                                .orElse(null);
        return lastPrime;
    }

    public boolean isPrime(BigInteger number){
        Optional<BigInteger> notPrime = Stream.iterate(BigInteger.ONE.add(BigInteger.ONE), n -> n.add(BigInteger.ONE)).limit(number.subtract(BigInteger.ONE).longValue())
                                        .filter(i -> number.mod(i).equals(BigInteger.ZERO))
                                        .findFirst();
        return !notPrime.isPresent() || notPrime.get().equals(number);
    }
}
