import java.util.*;
public class Exponent {

    public static int get_exponent(int num,int pow){
        int [] container = new int[ pow - 1 ];
        int res = num;

        for(int i = 0; i < container.length; i++){
            container[i] = num;
            res *= container[i];
        }
        return res;

    }
}
