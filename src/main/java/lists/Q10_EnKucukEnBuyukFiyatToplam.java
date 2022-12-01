package lists;

import java.util.Arrays;
import java.util.List;

public class Q10_EnKucukEnBuyukFiyatToplam {
    public static void main(String[] args) {
/*        Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70                    */
        List<String> myList = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        System.out.println(myList);

        int top= 0;
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        for (String w : myList){
            Double sayi = Double.parseDouble(w.replace("$",""));
          max=Math.max(max,sayi);
          min =Math.min(min,sayi);
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("toplam = " + (min+max));


    }
}
