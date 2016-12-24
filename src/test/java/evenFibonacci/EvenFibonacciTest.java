package evenFibonacci;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenFibonacciTest {
    /*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms.
    By starting with 1 and 2, the first 10 terms will be:

    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    By considering the terms in the Fibonacci sequence whose values
    do not exceed four million,
    find the sum of the even-valued terms.
     */

    private EvenFibonacci evenFibonacci;

    @Before
    public void setUp(){
        evenFibonacci = new EvenFibonacci();
    }

    @Test
    public void generateFibonacci_upTo90_returnsListOfFibonacciNumbers(){
        assertThat(evenFibonacci.generateFibonacci(90)).isEqualTo(Lists.newArrayList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
    }

    @Test
    public void findSumOfEvenValues_givenList123456_returns12(){
        assertThat(evenFibonacci.findSumOfEvenValues(Lists.newArrayList(1,2,3,4,5,6))).isEqualTo(12);
    }

    @Test
    public void findSumOfEvenValues_givenFibonacciLessThan4Million_returnsTheAnswer(){
        Integer answer = evenFibonacci.findSumOfEvenValues(
                evenFibonacci.generateFibonacci(4000000));
        assertThat(answer).isEqualTo(4613732);
        System.out.println(answer);
    }

}