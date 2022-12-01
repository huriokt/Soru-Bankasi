package strinanipulations;

public class Q02_UzunlukBulma {
    public static void main(String[] args) {

        /*      Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz              */


        String str1="Ali Can" ;
        String str2 = "Merve Star";
        String str3 = "Mark Tom";
        String str11 = str1.trim().replaceAll("\\s","");
        String str22 = str2.trim().replaceAll("\\s","");
        String str33 = str3.trim().replaceAll("\\s","");

        int a=str11.length();
        int b=str22.length();
        int c=str33.length();
        System.out.println(a+b+c);


















    }
}
