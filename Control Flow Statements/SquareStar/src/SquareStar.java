public class SquareStar {
    public static void main(String args[]) {
        getSquareStar(5);
        getSquareStar(8);
        getSquareStar(11);

    }

    public static void getSquareStar(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        else {
            for (int row = 0; row < number; row++) {
                for (int col = 0; col < number; col++) {
                    if (row == 0 || col == 0 || row == col || row == number - 1 || col == number - 1 || number - 1 == (row + col)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}