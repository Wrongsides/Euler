package problems;


import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestPrimeFactorTest {

    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
     */

    private LargestPrimeFactor largestPrimeFactor;

    @Before
    public void setUp(){
        largestPrimeFactor = new LargestPrimeFactor();
    }

    @Test
    public void isPrime_for29_returnsTrue(){
        assertThat(largestPrimeFactor.isPrime(new BigInteger("29"))).isTrue();
    }
    @Test
    public void isPrime_for28_returnsFalse(){
        assertThat(largestPrimeFactor.isPrime(new BigInteger("28"))).isFalse();
    }

    @Test
    public void findLargestPrimeFactorOf_13195_returns29(){
        assertThat(largestPrimeFactor.findLargestPrimeFactorOf(new BigInteger("13195"))).isEqualTo(new BigInteger("29"));
    }

    @Test
    public void findLargestPrimeFactorOf_600851475143_returnsTheAnswer(){
        BigInteger answer = largestPrimeFactor.findLargestPrimeFactorOf(new BigInteger("600851475143"));
        System.out.println(answer);
        assertThat(answer).isEqualTo(null);
    }

}