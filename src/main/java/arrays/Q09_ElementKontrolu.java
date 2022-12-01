package arrays;

public class Q09_ElementKontrolu {
    public static void main(String[] args) {
      /*
      Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};      */

        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s = "huri";


        //1.YOL

        int counter = 0;
        for (String w : arr) {

            if (w.contains(s)) {
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Aranan element yoktur");
        }else {
            System.out.println("Aranan element vardir");
        }

    }
}