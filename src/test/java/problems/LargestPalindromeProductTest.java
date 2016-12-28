package problems;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LargestPalindromeProductTest {


    @Test
    public void isPalindrome_for9009_returnsTrue(){
        LargestPalindromeProduct largestPalindromeProduct = new LargestPalindromeProduct();
        assertThat(largestPalindromeProduct.isPalindrome(9009)).isTrue();
    }

    @Test
    public void isPalindrome_for9008_returnsFalse(){
        LargestPalindromeProduct largestPalindromeProduct = new LargestPalindromeProduct();
        assertThat(largestPalindromeProduct.isPalindrome(9008)).isFalse();
    }
}