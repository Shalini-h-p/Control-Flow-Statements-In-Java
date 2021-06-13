import java.util.Scanner;

public class UserInputReadingChallenge {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println(" Enter the order# " + order + " : ");

            boolean isAnInt = scan.hasNextInt();
            if (isAnInt) {
                int number = scan.nextInt();
                counter++;
                sum += number;
                if (counter == 5) {
                    break;
                }

            } else {
                System.out.println("Invalid input");
            }
            scan.nextLine();
        }
        System.out.println("sum is=" + sum);
    }
}
