package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q04_OgelerinAzalanSirasi {
    public static void main(String[] args) {
         /*      Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        Örnek: ("Sarı","Mavi" ,"Yeşil", "Kırmızı" ) ==> Çıktı: Azalan sırada değil
               ("Kırmızı", "Mavi","Sarı","Yeşil") ==> Çıktı:  Azalan sıradadır    */

        List<String> list =new ArrayList<>(Arrays.asList("Kırmızı", "Mavi","Sarı","Yeşil"));
        System.out.println(list);
        System.out.println("****");
        List<String> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);
        System.out.println("****");

        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("****");

        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(list1.get(i))){
                counter++;
            }

        }
if (counter==list.size()){
    System.out.println("Azalan sıradadır");
}else
    System.out.println("Azalan sırada değil");

    }



}
