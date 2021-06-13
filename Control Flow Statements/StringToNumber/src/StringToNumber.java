public class StringToNumber {
    public static void main(String args[]) {
        String numberAsString = "1234.54";
        System.out.println("numberAsString=" + numberAsString);

//        int number=Integer.parseInt(numberAsString);  //converting string to Integer
//        System.out.println("number="+number);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number=" + number);

        numberAsString += 1;               //string is concatinated with 1
        number += 1;
        System.out.println("numberAsString=" + numberAsString);
        System.out.println("number=" + number);

    }
}
