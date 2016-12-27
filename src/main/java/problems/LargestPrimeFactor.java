package problems;

import com.google.common.collect.Lists;

import java.math.BigInteger;
import java.util.List;
import java.util.OptionalLong;
import java.util.stream.LongStream;

public class LargestPrimeFactor {

    private final long number;
    private List<Long> primes;

    public LargestPrimeFactor(long number){
        this.number = number;
        this.primes = Lists.newArrayList();
    }

    public OptionalLong getLargestPrimeFactor() {

        return LongStream.iterate(3, n -> n + 2)
                .filter(i -> BigInteger.valueOf(i).isProbablePrime(1))
                .filter(i -> number % i == 0L)
                .filter(this::maxPrimeFactor)
                .findFirst();
    }

    public boolean maxPrimeFactor(long primeFactor){
        primes.add(0, primeFactor);
        long checkValue = number;

        for (Long prime : primes) {
            checkValue = checkValue / prime;
        }

        return checkValue == 1L;
    }
}
