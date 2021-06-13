public class AllFactors {
    public static void main(String args[]) {
        printFactors(10);
        printFactors(50);
        printFactors(24);
        printFactors(32);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}


//public static List<Integer> printFactors(int number) {
//      List<Integer> listOfFactors = new ArrayList<>();
//
//        for (int i = 1; i <= number; i++) {
//            if ((number % i) == 0) {
//                listOfFactors.add(i);
//            }
//        }
//        return listOfFactors;
//    }
//}
//

