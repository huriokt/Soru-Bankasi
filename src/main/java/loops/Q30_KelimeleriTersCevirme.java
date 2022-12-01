package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Q30_KelimeleriTersCevirme {
    public static void main(String[] args) {
/*  Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.  */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz giriniz: ");
        String cumle = input.nextLine();

        String yeniCumle[] = cumle.split(" ");
        //        System.out.println(Arrays.toString(yeniCumle));
        String tersCumle[] = new String[yeniCumle.length];
        for (int i = yeniCumle.length - 1; i >= 0; i--) {


            System.out.print(yeniCumle[i] + " ");

        }


        //////////////KITAP//////////////
        /*
                public static void main(String[] args) {
                String input = "Ali\n" +
                "Veli Han\n" +
                "Kemal Can Kuzu";
                String rev = "";
                String[] lines = input.split(System.getProperty("line.separator"));
                for(String w : lines) {
                String[] words = w.split(" ");
                for (int i = words.length - 1; i >= 0; i--) {
                if (i != 0) {
                rev = rev + words[i] + " ";
                } else {
                rev = rev + words[i];
                }
                }
                System.out.println(rev);
                rev="";
                }
                }
         */


    }
}
