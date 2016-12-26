package problems;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Multiples3and5Test {

   /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
     */

    private Multiples3and5 multiples3and5;

    @Before
    public void setUp() {
        multiples3and5 = new Multiples3and5();
    }

    @Test
    public void findMultiplesOf_3forNumbersBelow10_returns369() {
        assertThat(multiples3and5.findMultiplesOf(3, 10)).isEqualTo(Lists.newArrayList(3, 6, 9));
    }

    @Test
    public void findMultiplesOf_5forNumbersBelow10_returns5() {
        assertThat(multiples3and5.findMultiplesOf(5, 10)).isEqualTo(Lists.newArrayList(5));
    }

    @Test
    public void sumValuesFromLists_givenTwoLists_returnsTheSumOfAllValues(){
        List<Integer> multiplesOfThree = Lists.newArrayList(3, 6, 9);
        List<Integer> multiplesOfFive = Lists.newArrayList(5);
        assertThat(multiples3and5.sumValuesFromLists(multiplesOfThree,multiplesOfFive)).isEqualTo(23);
    }

    @Test
    public void sumValuesFromLists_givenMultiplesOf3or5Below1000_retrunsTheAnswer(){
        List<Integer> multiplesOfThree = multiples3and5.findMultiplesOf(3, 1000);
        List<Integer> multiplesOfFive = multiples3and5.findMultiplesOf(5, 1000);
        Integer answer = multiples3and5.sumValuesFromLists(multiplesOfThree, multiplesOfFive);
        assertThat(answer).isEqualTo(233168);
        System.out.println(answer);
    }
}