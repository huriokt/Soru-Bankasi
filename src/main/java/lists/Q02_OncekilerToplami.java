package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_OncekilerToplami {
    public static void main(String[] args) {
      //  Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.

        List<Integer> lst = new ArrayList<>(Arrays.asList(12,31,7,13,10));

        int sum = 0 ;

        for (int i = 0; i < lst.indexOf(13); i++) {
            sum += lst.get(i);
        }
        System.out.println(sum);


        //2.YOL Kitap cozumu Bence hatali

        for (Integer w : lst){
            if(w==13){
                break;
            }
            sum += w;
        }
        System.out.println(sum);
    }




}
