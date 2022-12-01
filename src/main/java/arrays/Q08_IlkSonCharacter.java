package arrays;

public class Q08_IlkSonCharacter {
    public static void main(String[] args) {
        /*
        İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
         */

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        for (String w :arr){

            String    ilk = w.substring(0,1);
            String son = w.substring(w.length()-1);

            if (ilk.equals(son)){
                System.out.println(w);
            }

        }
        System.out.println("*****************");
                    //2.YOL for loop
        
        for (int i = 0; i < arr.length; i++) {
            String bas = arr[0];                 ///veya  arr[i].substring(0,1)
            String bitis = arr[arr.length-1];   ///veya  arr[i].substring(arr[i].length()-1))
            if (bas.equals(bitis)){
                System.out.print(arr[i]);
            }

        }
        ////FahriBey////
        // Soru 8: İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        // {"alabama", "pick", "sos", "sets", "pex"};
        // System.out.println("girmek istediğiniz eleman ssayısını yazın:");
        // int uzunluk = input.nextInt();
        // String[] kelime = new String[uzunluk];
        // System.out.println("Elemanalrı girniz: ");
        // for (int i = 0; i < kelime.length; i++) {
        // kelime[i] = input.next();
        // }for (int i = 0; i < kelime.length; i++) {
        // if (kelime[i].charAt(0) == kelime[i].charAt(kelime[i].length() - 1))
        // {
        // System.out.println(kelime[i]);
        // }}
        // System.out.println("eksik kelime hatali giris");


    }
}
