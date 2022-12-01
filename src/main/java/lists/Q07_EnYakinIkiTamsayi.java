package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q07_EnYakinIkiTamsayi {
    public static void main(String[] args) {
 /*       Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür   */

        List<Integer> lst = new ArrayList<>(Arrays.asList(12, 31, 15, 13, 54));
        System.out.println(lst);

        Collections.sort(lst);
        System.out.println(lst);

        int fark=Integer.MAX_VALUE;
        int flag = 0;

        for (int i = 1; i < lst.size(); i++) {
           int enYakin=lst.get(i)-lst.get(i-1);
           fark=Math.min(fark,enYakin);

            flag++;

        }
        System.out.println(fark);
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) - lst.get(i - 1) == fark) {
                System.out.println(lst.get(i));
                System.out.println(lst.get(i - 1));
            }
        }








    }
}
