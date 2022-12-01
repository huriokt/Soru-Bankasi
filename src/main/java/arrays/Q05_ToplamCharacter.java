package arrays;

public class Q05_ToplamCharacter {
    public static void main(String[] args) {
/*
String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
 */


        String arr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};


        int top = 0;

        for (String w : arr) {
            top += w.length();
        }
        System.out.println("toplan character = " + top);


    }


}
