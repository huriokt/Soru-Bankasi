package strinanipulations;

public class Q15_FiyatlarToplami {
    public static void main(String[] args) {
       /*
        String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız. 4898.0$           */

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        String gomlek = gomlekFiyat.replaceAll("\\W","");
        String kitap = kitapFiyat.replaceAll("[\\p{Punct}]","");
        //String kitap = kitapFiyat.replaceAll("[$.]","");
        //System.out.println(gomlek);
        //System.out.println(kitap);

        Double newGomlek = Double.valueOf(gomlek);
        Double newKitap = Double.valueOf(kitap);

        System.out.println((newGomlek+newKitap)/100+"$");//48.98$
        System.out.println(newGomlek+newKitap+"$");//4898.0$


















    }
}
