import java.util.*;
public class HextoBin {
    BintoDec convert = new BintoDec();

    public int get_Shift(int length){
        int shift = 0;
        while (length%4 != 0){
            length++;
            shift++;
            System.out.println(shift);
        }
        return shift;

    }

    public void assign_Bin(int shift, int [] hexBin, int [] binary){
        for (int i = shift, j = 0 ; i < hexBin.length; i++){
            hexBin[i] = binary[j];
            j++;
        }

    }

    public void ShowBin(int [] hexBin){
        for (int i = 0; i < hexBin.length; i++){
            System.out.print(hexBin[i]);
        }
    }

    public String getBits (int [] hexBin){
        BintoDec convert = new BintoDec();
        String Hex = "";
        int decimal = 0;

        int [] bits = new int [4];

           for(int i = 0, j = 1; i < hexBin.length; j++,i++){
               bits[j-1] = hexBin[i];

               if (j%4 == 0){
                  decimal = convert.Convert(bits,bits.length);
                  j = 0;

                  if(decimal != 0 ) {
                      if (decimal >= 10) {

                          switch (decimal) {
                              case 10:
                                  Hex += "A";
                                  break;

                              case 11:
                                  Hex += "B";
                                  break;

                              case 12:
                                  Hex += "C";
                                  break;

                              case 13:
                                  Hex += "D";
                                  break;

                              case 14:
                                  Hex += "E";
                                  break;

                              case 15:
                                  Hex += "F";
                                  break;

                          }
                      } else {
                          Hex += Integer.toString(decimal);
                      }
                  }else {
                      Hex += "";
                  }

                   decimal = 0;
               }


           }

        return Hex;

    }


}
