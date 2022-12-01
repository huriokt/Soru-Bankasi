package loops;

import java.util.Scanner;

public class Q31_TersCevirme {
    public static void main(String[] args) {
  /*      Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Her giriş satırındaki ilk
        ve son sözcükler dışındaki sözcüklerin sırasını tersine çevirip sözcükleri değiştirmeden kodu yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
                Örnek; Kemal Can Tan Han Kuzu, Kemal Han Tan Can Kuzu'ya dönüşecektir.  */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz giriniz: ");
        String cumle = input.nextLine();

        String yeniCumle[] = cumle.split(" ");
        //        System.out.println(Arrays.toString(yeniCumle));
        String tersCumle[] = new String[yeniCumle.length];
        int i =0 ;

                System.out.print(yeniCumle[0]+" ");

                for ( i = yeniCumle.length - 2; i >= 1; i--) {
                    System.out.print(yeniCumle[i] + " ");
            }
                System.out.print(yeniCumle[yeniCumle.length-1]+" ");











    }
}
