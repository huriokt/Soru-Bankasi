package arrays;

import java.util.Arrays;

public class C02 {
    public static void main(String[] args) {
         /*     String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli   */

        String arr[]={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        Arrays.sort(arr);

        int enKucuk = arr[0].length();

        for (String w : arr){
         enKucuk= Math.min(enKucuk,w.length());

        }
        for (String w : arr){
            if(enKucuk==w.length()){
                System.out.println("en kisa " + w);
            }
        }






    }
}
