package loops;

public class Q12_Oruntu {
    public static void main(String[] args) {
       /* Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
            AAAAAAAA
            AXXXXXXA
            AXXXXXXA
            AXXXXXXA                                          */


        int satir= 4;
        int sutun = 8;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("A");
            }
        }
        System.out.println();
        for (int i = 1; i <satir ; i++) {
            for (int j = 0; j < sutun; j++) {
                if(j==0||j==sutun-1){
                    System.out.print("A");
                } else {
                    System.out.print("X");

                }

            }
            System.out.println();


            //2.YOL
    //        int i=1;
            int rows = 4, columns = 8;
            for ( i = 1; i <= rows; i++) {  //  Satir kontrolu
                for (int j = 1; j <= columns; j++)
                    if ((i == 1&&(j==1||j==2||j==3||j==4||j==5||j== 6||j==7||j==8))||(i == 4&&(j==1||j==2||j==3||j==4||j==5||j== 6||j==7||j==8))||
                            (i ==2&&(j==1||j==8))||(i ==3&&(j==1||j==8))){
                        System.out.print("A");
                    }
                    else {
                        System.out.print("X");
                    }
                System.out.println();
            }








































            ;
        }


        System.out.println();
//2.Yol

        for (int k = 0; k <4 ; k++) {
            for (int m = 0; m < 8; m++) {
                if (k==0){
                    System.out.print("A");
                }else {
                    if (m==0||m==7){
                        System.out.print("A");
                    }else {
                        System.out.print("X");
                    }
                }

            }
            System.out.println();
        }






    }
}
