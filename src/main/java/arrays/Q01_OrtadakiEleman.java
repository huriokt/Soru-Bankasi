package arrays;

import java.util.Arrays;

public class Q01_OrtadakiEleman {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10    */


        int arr[] = {12, 5, 8};
        Arrays.sort(arr);

        int uzunluk = arr.length;
        System.out.println(uzunluk);
        int istenen = arr[arr.length/2];
        System.out.println(istenen);
        System.out.println("***********");

        int arr1[] = {12, 5, 8, 13};
        Arrays.sort(arr1);
        System.out.println(arr1.length);
        int istenen2 = (arr1[1]+arr1[arr1.length-1])/2 ;
        System.out.println(istenen2);
        System.out.println("****************");
        if(arr.length%2!=0){
            int ortadaki = arr[arr.length/2];
            System.out.println(ortadaki);
        }else {
            int ortadaki = (arr[1]+arr[arr.length-1])/2;
            System.out.println(ortadaki);
        }



    }
}
