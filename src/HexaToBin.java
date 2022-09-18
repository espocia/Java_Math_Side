import java.util.*;
public class HexaToBin {

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
        DectoBin destobin = new DectoBin();

        for (int i = 0; i < hexa.length(); i++){
            int decimal = 0;

            switch (hexa.charAt(i)){
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

            int length = destobin.get_Length( decimal);
            bitsVal[i] = new GlobalVar();
            bitsVal[i].bits = destobin.Convert(decimal , length);

        }


        return bitsVal;
    }


}
