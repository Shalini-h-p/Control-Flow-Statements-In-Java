import java.util.Scanner;

public class InputCalculator {
    public static void main(String args[]) {
        int sum = 0, count = 0, avg =0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("enter number");
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int value = sc.nextInt();
                sum += value;
                count++;
            } else if (count == 0){
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                avg = sum/count;
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
