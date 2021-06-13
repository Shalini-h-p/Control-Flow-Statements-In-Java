public class EvenDigitSum {
    public static void main(String args[]) {
        System.out.println("The even digit sum is=" + getEvenDigitSum(23456));
        System.out.println("The even digit sum is=" + getEvenDigitSum(123456789));
        System.out.println("The even digit sum is=" + getEvenDigitSum(252));
        System.out.println("The even digit sum is=" + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while(number>0){
            if(number%2==0){
                sum+=number%10;
            }
            number/=10;
        }
        return sum;
    }

}