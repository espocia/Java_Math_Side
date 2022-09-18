import java.util.*;
public class DectoBin {

    public static void Display( int []binary){
        System.out.print("Binary: ");
        for (int i = (binary.length - 1); i >= 0; i--){
            System.out.print(binary[i]);
        }
    }

    public static int get_Length(int decimal){
        int itr = 0;
        while (decimal != 0){

            decimal /= 2;
            itr++;
        }
        return itr;
    }

    public static int [] Convert(int decimal, int length){
        HextoBin shift = new HextoBin();
        int shiftval = shift.get_Shift(length);

        int [] binary = new int[length + shiftval];
        for (int i = 0; i < binary.length; i++ ){

            if( i < shiftval){
                binary[i] = 0;
            }else {
                if ((decimal % 2) == 1) {
                    binary[i] = 1;
                } else {
                    binary[i] = 0;
                }
                decimal /= 2;
            }

        }
        return binary;
    }
}
