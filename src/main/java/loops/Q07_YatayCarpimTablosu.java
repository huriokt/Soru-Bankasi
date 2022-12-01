package loops;

public class Q07_YatayCarpimTablosu {
    public static void main(String[] args) {
       /* Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30*/


        for (int i = 3; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i+"x"+j+"="+i*j+" ");

            }
            System.out.println();
        }
            //2.YOL
        int i=3;
        while (i < 4){
            for (int j = 1; j < 11; j++) {
                System.out.print(i+"x"+j+"="+i*j+" ");
            }

            i++;
        }
        System.out.println();

        // 3.YOL

        do {

        }while (i < 4);






































    }
}
