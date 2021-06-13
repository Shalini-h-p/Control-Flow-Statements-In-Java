public class NumberPalindrome {
    public static void main(String args[]){
        System.out.println("the palindrome number is="+isPalindrome(-707));
        System.out.println("the palindrome number is="+isPalindrome(111));
        System.out.println("the palindrome number is="+isPalindrome(125));
        System.out.println("the palindrome number is="+isPalindrome(-1051));
        System.out.println("the palindrome number is="+isPalindrome(11211));

    }
    private static boolean isPalindrome(int number){

        int copyNumber = number;
        int tempHold = 0;

        while(copyNumber!=0){
            tempHold *= 10;
            tempHold += copyNumber%10;
            copyNumber /= 10;
        }
        return (tempHold == number);
    }
}
