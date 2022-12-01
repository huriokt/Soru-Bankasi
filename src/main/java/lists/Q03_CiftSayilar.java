package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_CiftSayilar {
    public static void main(String[] args) {

     /*      Bir tamsayi  listesindeki tum cift sayilarin carpimini bulunuz.    */

        List<Integer> lst = new ArrayList<>(Arrays.asList(12,31,7,13,10));

        int multiplay = 1 ;
        for (Integer w : lst){
            if (w %2==0){
                multiplay *=w;
            }
        }
        System.out.println(multiplay);










    }
}
