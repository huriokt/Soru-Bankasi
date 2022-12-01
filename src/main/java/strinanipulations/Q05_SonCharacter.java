package strinanipulations;

public class Q05_SonCharacter {
    public static void main(String[] args) {

   /*     Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek: 'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız.*/

        String str1 = "Ali Can";
        String str2 = "Miami";
        String str11 = str1.substring(str1.length()-1);
        String str22 = str2.substring(str2.length()-1);

        System.out.println(str11);
        System.out.println(str22);









    }
}
