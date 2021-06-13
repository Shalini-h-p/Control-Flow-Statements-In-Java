import java.util.Scanner;

public class UsingScanner {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scan.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter your name:");
            String name = scan.nextLine();
            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println(" your name is " + name + " and you are " + age + " years old ");
            } else {
                System.out.println("Invalid year of Birth");
            }
        } else {
            System.out.println("unable to pass year of Birth");
        }
    }

}

