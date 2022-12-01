package loops;

public class Q19_NoktalamaDisindakiler {
    public static void main(String[] args) {

     //   Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.


        String str= "Yassssa12*! mak";

        for (int i = 0; i < str.length(); i++) {
            str= str.replaceAll("[\\W]","");

        }
        System.out.println(str.length());

        //2.YOL
         /*
19) Bir String' deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
 */
        String strr = "Java is a strongly typed, object-oriented programming language.";
        int sum=0;
        for (int i = 0; i <strr.length() ; i++) {
            if (strr.charAt(i)>'A'&&strr.charAt(i)<'z'||strr.charAt(i)>'0'&&strr.charAt(i)<'9'){
                sum+=1;
            }

        }
        System.out.println("sum = " + sum);



    }
}
