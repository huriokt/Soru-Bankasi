package strinanipulations;

public class Q8_IlkCharcakerharicYazim {
    public static void main(String[] args) {
   /*     Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız.
                Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.   */


        String str = "Java";
        System.out.println(str.substring(1,str.length()).toUpperCase());




    }
}
