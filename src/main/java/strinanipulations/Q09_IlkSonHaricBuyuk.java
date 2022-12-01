package strinanipulations;

public class Q09_IlkSonHaricBuyuk {
    public static void main(String[] args) {
/*        Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.*/




        String str = "oktaygil";
        String str1 = str.substring(1,str.length()-2).toUpperCase();

        System.out.print(str.substring(0,1).toLowerCase());
        System.out.print(str1);
        System.out.print(str.substring(str.length()-1).toLowerCase());









































    }
}
