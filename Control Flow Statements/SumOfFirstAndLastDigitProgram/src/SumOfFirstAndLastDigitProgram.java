public class SumOfFirstAndLastDigitProgram {
    public static void main(String args[]) {
        System.out.println("The first and last digits of sum is=" + firstAndLastDigit(832));
        System.out.println("The first and last digits of sum is=" + firstAndLastDigit(252));
        System.out.println("The first and last digits of sum is=" + firstAndLastDigit(-10));
        System.out.println("The first and last digits of sum is=" + firstAndLastDigit(5));
        System.out.println("The first and last digits of sum is=" + firstAndLastDigit(257));

    }
    public static int firstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        int sum = number%10;
        while(number>=10){
            number/=10;
        }
        return sum+number;
    }
}
