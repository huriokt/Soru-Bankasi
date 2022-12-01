package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_IkiserArtma {
    public static void main(String[] args) {

 /*       Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
          Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)                    */

        List<Integer> ast=new ArrayList<>(Arrays.asList(12, 31, 7, 13, 10));
        for (Integer w : ast){
            if(w==7||w==10){
                continue;
            }else
                ast.set(ast.indexOf(w),w+2);
        }
        System.out.print(ast);

                //2.YOL

        for (Integer w : ast){
            if(w==7){
                ast.set(ast.indexOf(w),w);
            } else if (w==10){
                ast.set(ast.indexOf(w),w);}
            else
                ast.set(ast.indexOf(w),w+2);
        }
        System.out.print(ast);


    }
}
