public class InterestCalculation {
    public static void main(String args[]) {
        System.out.println("10,000 at 2% interest =" + calculateInterest(10000, 2.0));
        System.out.println("9000 at 3% interest=" + calculateInterest(9000, 3.0));
        System.out.println("10,000 at 4% interest=" + calculateInterest(10000, 4.0));

        for (int i = 1; i < 4; i++) {
            System.out.println(" Loop " + i + " hell0 ");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest =" + String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("*************************");

        for (int i = 8; i >= 2; i--) {
            System.out.println("100,000 at" + i + "% interest =" + String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("**********************************************************************************************************");

//Prime Number

    int count = 0;
    for(int i = 10; i<50; i++)

    {
        if (isPrimeNumber(i)) {
            count++;
            System.out.println("The number " + i + " is a prime number");
            if (count == 5) {
                System.out.println("Exiting for Loop");
                break;
            }
        }
    }

}

    public static boolean isPrimeNumber(int n){
        if(n==1){
            return false;
        }

            for(int i=2; i<=n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
                return true;
    }


    public static double calculateInterest(double amount,double interestRate){
        return (amount*(interestRate/100));
    }
}
