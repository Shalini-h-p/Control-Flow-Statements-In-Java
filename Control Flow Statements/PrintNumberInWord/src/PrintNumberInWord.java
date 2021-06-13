public class PrintNumberInWord {
    public static void main(String args[])
    {
        printInWord(1);
        printInWord(2);
        printInWord(3);
        printInWord(4);
        printInWord(5);
        printInWord(6);
        printInWord(7);
        printInWord(8);
        printInWord(9);
        printInWord(11);
    }
    public static void printInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                    System.out.println("OTHER");
                    break;
        }
    }
}
