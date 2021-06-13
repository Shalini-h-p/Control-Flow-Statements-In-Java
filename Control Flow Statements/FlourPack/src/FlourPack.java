public class FlourPack {
    public static void main(String args[]) {
        System.out.println(canPack(4, 9, 3));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(0, 21, 3));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount * 5 + smallCount >= goal) {
            goal %= 5;
        }
        return (smallCount >= goal);
    }
}
