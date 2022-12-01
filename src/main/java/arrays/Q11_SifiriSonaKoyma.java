package arrays;

import java.util.Arrays;

public class Q11_SifiriSonaKoyma {
    public static void main(String[] args) {
      /*  Tamsayılardan oluşan arrayde bulunan sıfırları , array sonuna yerleştiren kod yazınız.
        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)  */

        int arr[] = {5, 0, 2, 0, 3};

        int brr[] = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                brr[idx] += arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
        System.out.println("==============");
//2.YOL Kitap/////
        Integer[] crr = new Integer[]{5, 0, 2, 0, 3};
        Integer[] drr = new Integer[crr.length];
        int firstIdx = 0;
        int lastIdx = crr.length - 1;
        for (int i = 0; i < crr.length; i++) {
            if (crr[i] != 0) {
                drr[firstIdx] = crr[i];
                firstIdx++;
            } else {
                drr[lastIdx] = 0;
                lastIdx--;

            }
        }
    }
}