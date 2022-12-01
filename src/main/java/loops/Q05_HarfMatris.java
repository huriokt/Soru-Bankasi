package loops;

public class Q05_HarfMatris {
    public static void main(String[] args) {

     /*
     Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A
        A A A A A
        A A A A A   */

//        for (int i = 0; i <3 ; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("A");
//            }
//            System.out.println();
//        }
        //0.YOL
        int rows= 3;
        int columns = 5;

        for (int i = 0; i < rows; i++) {
            String str = "";
            for (int j = 0; j <columns ; j++) {
                str=str+"A";

            }
            System.out.println(str);
        }

        
        
                //2.YOL
//        int i = 0;
//        while (i <3){
//            for (int j = 0; j < 5; j++) {
//
//                System.out.print("A");
//            }
//            i++;
//            System.out.println();
//        }

                //3.YOL
//        int i = 0;
//        do {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("A");
//            }
//            i++;
//            System.out.println();
//        }while (i <3);
//




































    }
}
