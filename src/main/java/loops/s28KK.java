package loops;

import java.util.Scanner;

public class s28KK {
    public static void main(String[] args) {

        //Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
//        //Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz");
        int sayi = scan.nextInt();
        String sonuc = "";
        int count = 0;
        int rakamlar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 2; i < sayi; i++) {
            for (int j = 0; j < rakamlar.length; j++) {
                if(i % rakamlar[j] == 0) {
                    count++;
                }
            }
            if(count < 3) {
                sonuc = sonuc + i + " ";
            }
            count = 0;
        }
        System.out.println(sonuc);
    }
}
