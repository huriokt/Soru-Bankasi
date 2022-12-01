package loops;

public class Q06_UcgenYazma {
    public static void main(String[] args) {
        /*
        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A
        A A
        A A A
        A A A A                                 */

//        int rows=4;
//        for (int i = 0; i < rows; i++) {
//            String str = "";
//            for (int j = 0; j <=i; j++) {
//
//                    str = str+"A";
//
//                }
//                System.out.println(str);
//            }
//        System.out.println();
//            //0.YOL
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("A");
//            }
//            System.out.println();
//        }
                //2.YOL
        int i = 0;
        while (i<4){
            for (int j = 0; j <=i; j++) {
                System.out.print("A");
            }
          i++  ;
            System.out.println();
        }

        //3.YOL




















































    }
}
