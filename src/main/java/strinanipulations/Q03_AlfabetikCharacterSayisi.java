package strinanipulations;

public class Q03_AlfabetikCharacterSayisi {
    public static void main(String[] args) {

         /*  Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.*/

        String str = " Miami 33018!!!";

        int charcter= str.replaceAll("[^A-Za-z0-9]","").length();
        Integer karakterSayisi = str.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println(karakterSayisi);
        System.out.println(charcter);

















































    }
}
