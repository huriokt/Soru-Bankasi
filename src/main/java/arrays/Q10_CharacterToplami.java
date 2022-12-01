package arrays;

public class Q10_CharacterToplami {
    public static void main(String[] args) {
/*
Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};//21

 */

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        int toplam =0 ;

        for (String w : arr){
           toplam+= w.length();
        }
        System.out.println(toplam);

    }
}
