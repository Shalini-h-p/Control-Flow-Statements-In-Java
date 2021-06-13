public class SwitchStatements {
    public static void main(String args[])
    {
//       int value=8;
//       if(value==1){
//           System.out.println("Value was 1");
//       }else if(value==2){
//           System.out.println("value was 2");
//       }else{
//           System.out.println("value was not 1 or 2");
//       }

    int switchValue=5;
   switch(switchValue){
        case 1:
        System.out.println("switch value 1");
        break;

        case 2:
            System.out.println("switch value 2");
            break;
        case 3: case 4: case 5:
            System.out.println("was a 3 or a 4 or a 5");
            System.out.println("Actually it was a switch value");
            break;
       default:
            System.out.println("value was not 1 or 2");
            break;
    }

        char alphabets='D';
        switch(alphabets){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(alphabets +" was found ");
                break;
            default:
                    System.out.println("could not found");
                    break;
        }


        String month="JulY";
        switch(month.toUpperCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "JULY":
                System.out.println("Jul");
                break;
                default :
            System.out.println("Not Sure");

        }
    }
}
