import java.util.*;
public class HexaToBin extends DectoBin {

    public void DisplayHex(GlobalVar[] bitsVal, int length){
        for (int i = 0 ; i < bitsVal.length; i++){
            for (int j = 0; j < bitsVal[i].bits.length; j++){

                System.out.print(bitsVal[i].bits[j]);
                length ++;

            }

        }

        System.out.println(" length: "+ length);

    }

    public GlobalVar [] Convert(String hexa, GlobalVar[] bitsVal){

        for (int i = 0; i < hexa.length(); i++){
            int decimal = 0;

            switch (hexa.charAt(i)){
                case '0':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '1':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '2':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '3':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '4':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '5':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '6':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '7':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '8':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case '9':
                    decimal = Character.getNumericValue(hexa.charAt(i));
                    break;
                case 'A': case 'a':
                    decimal = 10;
                    break;
                case 'B': case 'b':
                    decimal = 11;
                    break;
                case 'C': case 'c':
                    decimal = 12;
                    break;
                case 'D': case 'd':
                    decimal = 13;
                    break;
                case 'E': case 'e':
                    decimal = 14;
                    break;
                case 'F': case 'f':
                    decimal = 15;
                    break;
            }

            int length = get_Length( decimal);
            bitsVal[i] = new GlobalVar();
            bitsVal[i].bits = Convert(decimal , length);

        }


        return bitsVal;
    }

    public static int [] Convert(int decimal, int length){
        HextoBin shift = new HextoBin();
        int shiftval = shift.get_Shift(length);

        if( decimal == 0){

            int [] binary = {0,0,0,0};

            return binary;

        }else {
            int[] binary = new int[length + shiftval];
            for (int i = binary.length - 1; i >= 0; i--) {

                if (i < shiftval) {
                    binary[i] = 0;
                } else {
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


}
