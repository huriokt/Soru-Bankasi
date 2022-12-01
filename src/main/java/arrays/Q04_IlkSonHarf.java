package arrays;


public class Q04_IlkSonHarf {
    public static void main(String[] args) {

        /*   String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.

                Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM              */


        String arr[] ={"Kemal","Jonathan","Mark","Jackson","Ali"};

        for( String w : arr){
            if(w.endsWith("n")){
                System.out.print(w.charAt(0));
            }
            if(w.endsWith("k")){
                System.out.print(w.charAt(0));

            }
        }



    }
}
