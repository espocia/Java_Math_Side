import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);


        int input = 0;

        System.out.println("Select Operation:");
        System.out.println("1: Decimal     ->   binary");
        System.out.println("2: Binary      ->   decimal");
        System.out.println("3: Binary      ->   hexademical");
        System.out.println("4: hexadecimal ->   binary");

        System.out.print("input: ");
        input = userInput.nextInt();

        switch (input){
            case 1:
                Case1(userInput);
                break;

            case 2:
                Case2(userInput);
                break;

            case 3:
                Case3(userInput);
                break;
            case 4:
                Case4(userInput);
                break;


        }

    }

    public static void Case1(Scanner userInput){
        GlobalVar var = new GlobalVar();
        DectoBin dectobin = new DectoBin();

        System.out.print("Input : ");
        var.decimal = userInput.nextInt();
        var.length = dectobin.get_Length(var.decimal);
        var.binary = dectobin.Convert(var.decimal,var.length);
        System.out.println("binary length: "+var.length + " ");
        dectobin.Display(var.binary);
    }

    public static void Case2(Scanner userInput){
        GlobalVar var1 = new GlobalVar();
        BintoDec bintodec = new BintoDec();

        System.out.print("Input your binary length in digits: ");
        var1.length = userInput.nextInt();
        var1.binary = bintodec.getBinary(var1.length);
        var1.decimal = bintodec.Convert(var1.binary,var1.length);

        bintodec.ShowBinary(var1.binary , var1.decimal);
    }

    public static  void Case3(Scanner userInput){
        HextoBin hextobin = new HextoBin();

        BintoDec get_Binary = new BintoDec();

        System.out.print("Input Binary Length to convert: ");
        int length = userInput.nextInt();
        int [] binary = get_Binary.getBinary(length);
        int shift = hextobin.get_Shift(binary.length);
        int [] hexBin =  new int[shift + binary.length];


        hextobin.assign_Bin(shift, hexBin, binary);
        System.out.print("Binary: ");
        hextobin.ShowBin(hexBin);
        String Hex = hextobin.getBits(hexBin);
        System.out.println(" Hex: "+Hex);
    }


    public static void Case4(Scanner userInput){
        HexaToBin hexaTobin = new HexaToBin();
        System.out.print("Input Decimal Value: ");
        String  hexa = userInput.next();
        GlobalVar [] bitsVal = new GlobalVar[hexa.length()];
        GlobalVar binary = new GlobalVar();
        binary.binary = new int[hexa.length() * 4];
        int length = 0;


        bitsVal = hexaTobin.Convert(hexa,bitsVal);
        System.out.print("binary: ");
        hexaTobin.DisplayHex(bitsVal, length);

    }
}
