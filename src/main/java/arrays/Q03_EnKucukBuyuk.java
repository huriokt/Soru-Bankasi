package arrays;

import java.util.Arrays;

public class Q03_EnKucukBuyuk {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.

        Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2          */

        int arr[]= {-12, 18, -5, 23, -2};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int minPozitive =arr[arr.length-1] ;
        int maxNegative = arr[0];
        for (int w : arr){
            if(w>=0){
               minPozitive=Math.min(minPozitive,w);
            }
            if(w<0){
                maxNegative = Math.max(maxNegative,w);
            }
        }
//        System.out.println("Minimum positive : " + minPozitive);
//        System.out.println("Maximum negative : " + maxNegative);
//

        //2.YOL

        int a[]={-12, 18, -5, 23, -2};
        Arrays.sort(a);
        for (int i = 0; i <a.length ; i++) {
            if(a[i]<0&&a[i+1]>0){
                System.out.println("Minimum positive : " + a[i+1]);
                System.out.println("Maximum negative : " +a[i]);

            }

        }





    }
}
