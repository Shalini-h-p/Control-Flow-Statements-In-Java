public class SumOddRange {
    public static void main(String args[]) {
        System.out.println("the sum of odd is=" + sumOdd(13, 13));
        System.out.println("the sum of odd is=" + sumOdd(1, 100));
        System.out.println("the sum of odd is=" + sumOdd(100, 100));
        System.out.println("the sum of odd is=" + sumOdd(100, 1000));
        System.out.println("the sum of odd is=" + sumOdd(100, -100));
    }

    private static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 1) {
            return true;
        }
        return false;
    }

    private static int sumOdd(int start, int end) {
        if ((start < 0) || (end < 0) || (start > end)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
