package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06_ElemanKaldirma {
    public static void main(String[] args) {

 /*       Listede 15 veya 13  eleman olarak varsa, bunlari kaldiriniz.
    Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)    */

        List<Integer> lst = new ArrayList<>(Arrays.asList(10, 31, 15, 13, 54));
//        if(lst.contains(13)){
//            lst.remove(lst.indexOf(13));
//        }
//        if(lst.contains(15)){
//            lst.remove(lst.indexOf(15));
//        }
//        System.out.println(lst);

        /////2.YOL/////

        if(!lst.contains(13)&&!lst.contains(15)){
            System.out.println("Listede 13 ve 15 elemani yoktur");
        }else
        if(lst.contains(13)){
            lst.remove(lst.indexOf(13));
        }
        if(lst.contains(15)){
            lst.remove(lst.indexOf(15));
        }
        System.out.println(lst);

    }
}
