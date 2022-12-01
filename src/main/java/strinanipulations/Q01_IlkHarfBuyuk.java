package strinanipulations;

import java.util.Locale;

public class Q01_IlkHarfBuyuk {
    public static void main(String[] args) {
       /* Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
                Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.                    */



        String city = "mIAMI";
        String newCity = city.trim().toLowerCase(Locale.ROOT);
        String ilkHarf  =city.substring(0,1).toUpperCase(Locale.ROOT);
        String digerHarf=city.substring(1);
        System.out.println(ilkHarf+digerHarf);












































    }
}
