public class DigitSumChallenge {
    public static void main(String args[]) {
        System.out.println("the sum of digits in a number 6 is=" + sumDigits(16));
        System.out.println("the sum of digits in a number 12 is=" + sumDigits(42));
        System.out.println("the sum of digits in a number 123546 is=" + sumDigits(123546));
        System.out.println("the sum of digits in a number -162 is=" + sumDigits(-162));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }


}
