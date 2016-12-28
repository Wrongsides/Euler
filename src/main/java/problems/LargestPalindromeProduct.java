package problems;

public class LargestPalindromeProduct {

    private int from;
    private int to;

    public LargestPalindromeProduct fromTwoDigitNumbers(){
        this.from = 10;
        this.to = 99;
        return this;
    }

    public LargestPalindromeProduct fromThreeDigitNumbers(){
        this.from = 100;
        this.to = 999;
        return this;
    }

    public int is(){

        return 0;
    }

    public boolean isPalindrome(int number){
        String stringNumber = String.valueOf(number);
        String firstHalf = stringNumber.substring(0, stringNumber.length() / 2);
        StringBuilder secondHalf = new StringBuilder(
                stringNumber.substring(stringNumber.length() / 2, stringNumber.length())
        );
        return firstHalf.equals(secondHalf.reverse().toString());
    }

}
