package problems;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestPrimeFactorTest {

    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
     */

    private LargestPrimeFactor largestPrimeFactor;

    @Test
    public void findLargestPrimeFactorOf_13195_returns29(){
        largestPrimeFactor = new LargestPrimeFactor(13195L);
        assertThat(largestPrimeFactor.getLargestPrimeFactor().getAsLong()).isEqualTo(29L);
    }

    @Test
    public void findLargestPrimeFactorOf_600851475143_returnsTheAnswer(){
        largestPrimeFactor = new LargestPrimeFactor(600851475143L);
        long answer = largestPrimeFactor.getLargestPrimeFactor().getAsLong();
        System.out.println(answer);
        assertThat(answer).isEqualTo(6857L);
    }

}