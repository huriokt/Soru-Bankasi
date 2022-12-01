package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_EnkucukEnBuyukFarki {
    public static void main(String[] args) {
  /*      Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        büyük öğeler arasındaki farkı konsolda yazdırınız.  */


        Scanner input = new Scanner(System.in);
        System.out.println("Kac elemanli arry istersiniz :");
        int elemanSayisi = input.nextInt();

        int[] arr = new int[elemanSayisi];


        for (int i = 0; i < elemanSayisi; i++) {

            System.out.println("Lutfen bir sayi giriniz ");
            int sayi = input.nextInt();

            arr[i] += sayi;

        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        int fark=max-min;
        System.out.println("fark = "+fark);




    }
}
