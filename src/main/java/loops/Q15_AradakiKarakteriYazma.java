package loops;

public class Q15_AradakiKarakteriYazma {
    public static void main(String[] args) {

        /*  Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.     */


        String str = "";

//1.YOL
        for (char i = 'C'; i >='A' ; i--) {
            str+=i;

        }
        System.out.print(str);

        System.out.println();

        //2.YOL
        char hrf = 'C';
        char j=' ';
        while (j >='A'){
            str+=j;

            j--;

        }
        System.out.println(str);


//3.YOL
        char hrff= 'C';
        String s="";
        do {

            s+=hrff;

            hrff--;
        } while (hrff >= 'A');
        System.out.print(s);





    }
}
