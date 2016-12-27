package problems;

import com.google.common.collect.Lists;

import java.math.BigInteger;
import java.util.List;
import java.util.OptionalLong;
import java.util.stream.LongStream;

public class LargestPrimeFactor {

    private final long number;
    private List<Long> primeFactors;

    public LargestPrimeFactor(long number){
        this.number = number;
        this.primeFactors = Lists.newArrayList();
    }

    public OptionalLong getLargestPrimeFactor() {

        return LongStream.iterate(3, n -> n + 2)
                .filter(i -> BigInteger.valueOf(i).isProbablePrime(1))
                .filter(i -> number % i == 0L)
                .filter(this::maxPrimeFactor)
                .findFirst();
    }

    public boolean maxPrimeFactor(long newPrimeFactor){
        primeFactors.add(0, newPrimeFactor);
        long checkValue = number;

        for (Long primeFactor : primeFactors) {
            checkValue /= primeFactor;
        }

        return checkValue == 1L;
    }
}
