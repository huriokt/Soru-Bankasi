package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_ElemanDegistirme {
    public static void main(String[] args) {
        /*
        Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)    */

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 11, 15, 34, 43));

//        for (Integer w : list) {
//            if(w==15){
//                list.set(list.indexOf(w),51 );
//            }
//        }
//        System.out.print(list);
//        System.out.println();

        ///2.YOL Kitap Cozumu ///
        if(list.contains(15)){
            for (Integer w : list) {
                if(w==15){
                    list.set(list.indexOf(w),51 );
                }
            }
            System.out.println(list);
        }else
            System.out.println("Liste 15 elemanini icermiyor");

    }

}
