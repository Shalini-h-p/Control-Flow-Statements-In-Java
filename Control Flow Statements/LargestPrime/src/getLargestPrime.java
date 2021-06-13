public class getLargestPrime {
    public static void main(String args[]) {
        System.out.println(getLargestPrimeNumber(21));
        System.out.println(getLargestPrimeNumber(45));
        System.out.println(getLargestPrimeNumber(217));
        System.out.println(getLargestPrimeNumber(0));
        System.out.println(getLargestPrimeNumber(27));
    }

    public static int getLargestPrimeNumber(int number) {
        if (number < 2) {
            return -1;
        }
        int count = 2;
        while (number > 1) {
            if (number % count == 0) {
                number /= count;
            } else {
                count++;
            }
        }
        return count;
    }
}
