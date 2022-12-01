package loops;

import java.util.Arrays;

public class Q17_RakamlarToplami {
    public static void main(String[] args) {

       /* Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.*/

        int sayi = 235;

        int top = 0;

        for (int i = 235; i > 0; i/=10) {

            top += i % 10;
        }
        System.out.println(top);


        System.out.println();

   //     2.Yol
        int i = 235 ;
        int sum = 0 ;
        while (i>0){
            sum+= i%10;


            i/=10;
        }
        System.out.println(sum);
        System.out.println();
      //  3.YOL
        int j =235;
        int add= 0;
        do {
            add+=j%10;
            j/=10;
        }while (j>0);
        System.out.println(add);





        }
    }

