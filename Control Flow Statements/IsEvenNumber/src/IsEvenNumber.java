public class IsEvenNumber {
    public static void main(String args[]) {
        System.out.println(isEvenNumber(8));
        System.out.println(isEvenNumber(3));
        System.out.println(isEvenNumber(-1));
        System.out.println(isEvenNumber(12));
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}