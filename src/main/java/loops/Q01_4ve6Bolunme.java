package loops;

public class Q01_4ve6Bolunme {
    public static void main(String[] args) {
        /*

        120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız.              */


        for (int i = 120; i > 10; i--) {
            if (i % 6 == 0 || i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //2.YOL

        String str = "";
        for (int i = 120; i > 10; i--) {
            if (i % 6 == 0 || i % 4 == 0) {
                str = str + i + " ";
            }
        }
        System.out.print(str);
        System.out.println();
     //   3.YOL
        int i = 120;
        while (i > 10){
            if (i % 6 == 0 || i % 4 == 0)
                System.out.print(i+" ");
                i--;
        }
        System.out.println();
        i = 120;
        do{
            if (i % 6 == 0 || i % 4 == 0){

                System.out.print(i+" ");
            }

            i--;

        }while (i > 10);




































    }




}