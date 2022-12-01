package lists;

import java.util.Arrays;
import java.util.List;

public class Q09_FiyatlarToplami {
    public static void main(String[] args) {

/*        Bir String listesinde verilen tum fiyatların toplamını bulunuz.
        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70   */

        List<String> myList = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        System.out.println(myList);

        int top= 0;

//        for (int i = 0; i < myList.size(); i++) {
//            Double price = Double.valueOf(myList.get(i).replace("$",""));
//           top+=price;
//        }
//        System.out.println(top);


        //2.YOL//
//        for (String w : myList){
//            Double sayi = Double.valueOf(w.replace("$",""));
//            top+=sayi;
//        }
//        System.out.println(top);

        //3.YOL//
        for (String w : myList){
            Double sayi = Double.parseDouble(w.replace("$",""));
            top+=sayi;
        }
        System.out.println(top);
    }
}
