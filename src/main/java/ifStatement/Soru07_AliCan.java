package ifStatement;

import java.util.Scanner;

public class Soru07_AliCan {

    public static void main(String[] args) {
        /*Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
                a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
                b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
                c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
                d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
        yazmalıdır.
                e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
        yazmalıdır.
                Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
        görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
        "Geçersiz Ad"*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String kullanici = input.nextLine();
        char isimBasharf = kullanici.charAt(0);
        char soyBasharf = kullanici.split(" ")[1].charAt(0);
        if((isimBasharf>='a'&&isimBasharf<='z')&&(soyBasharf>='a'&&soyBasharf<='z')){
            System.out.println("Baş harflerinde hata");
        }if(kullanici.contains(" ")){
            System.out.println("Format hatası");
        }




    }
}
