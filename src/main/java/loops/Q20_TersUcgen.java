package loops;

public class Q20_TersUcgen {
    public static void main(String[] args) {
/*
Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                    * * * * * *
                    * * * * *
                    * * * *
                    * * *
                    * *
                    *                                       */

        int sayi=6;
        String s = "";
        for(int i=1; i<= sayi; i++){  //satir kontrolu

            for(int k=6; k>=i; k--){  //sutun kontrolu

                s +=  "* ";
            }

            System.out.println(s);
            s = "";
        }









  /*      for (int i = 0; i <6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }*/




    }
}
