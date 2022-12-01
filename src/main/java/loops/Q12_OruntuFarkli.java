package loops;

public class Q12_OruntuFarkli {
    public static void main(String[] args) {

         /* Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
            A A A A A A A A
            A X X X X X X A
            A X X X X X X A
            A A A A A A A A
                                         */

        int rows = 4, columns = 8;
        for (int i = 1; i <= rows; i++) {  //  Satir kontrolu

            if (i == 1 || i == rows) {              //  1.ve 4. satirlarin
                for (int k = 1; k <= columns; k++) { //tum sutunlari icin "A" yazdir
                    System.out.print("A");
                }
                System.out.println(); //alt satıra geçmek için
            } else { //  ilk ve son satır değilse
                System.out.print("A"); // bir tane A yaz
                for (int k = 2; k < columns; k++) { //2. sutündan başla son sütuna kadar x yazdır
                    System.out.print("X");
                }
                System.out.println("A");// son sütuna bir tane A yazdır
            }
        }

///////2.YOL
   //     int rows = 4, columns = 8;
        for (int i = 1; i <= rows; i++) {  //  Satir kontrolu
            for (int j = 1; j <= columns; j++)
                if ((i == 2&&(j==2||j==3||j==4||j==5||j== 6||j==7))||(i == 3&&(j==2||j==3||j==4||j==5||j== 6||j==7))){

                    System.out.print("X");
                }

                else {

                    System.out.print("A");
                }
            System.out.println();
        }

        }
    }