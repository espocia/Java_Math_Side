import java.util.*;
import java.lang.Math;
public class BintoDec {


    public static void ShowBinary(int [] binary, int decimal){
        System.out.print("Binary: ");
        for (int i = 0; i < binary.length; i++){
            System.out.print(binary[i]);
        }
        System.out.println(" Decimal: "+decimal);
    }

    public static int Convert(int [] binary , int length){
        int decimal = 0;
        for(int i = 0; i < binary.length; i++){
            if(binary[i] == 1){

                decimal += (int)(Math.pow(2,(length - 1)));

            }
            length--;
        }
        return  decimal;
    }

    public static int[] getBinary(int length){
        Scanner userInput = new Scanner(System.in);

        int [] binary = new int[length];

        for(int i = 0; i < length; i++){

            System.out.print("Input respective binary digit: ");
            binary[i] = userInput.nextInt();

        }

        return binary;

    }


}
