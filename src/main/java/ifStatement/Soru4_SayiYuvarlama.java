package ifStatement;

public class Soru4_SayiYuvarlama {
    public static void main(String[] args) {
        /*Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla” */

        int a = 128;
        if(a%10>=5){
            System.out.println("yuvarlama işlemi: " +(a+(10-a%10)));
        }else {
            System.out.println("yuvarlama işlemi: " +(a-(a%10)));
        }
//2.Yol
        if(a%10>=5){
            System.out.println("yuvarlama işlemi: " +(a/10+1)*10);
        }else {
            System.out.println("yuvarlama işlemi: " +(a/10)*10);
        }
    }
}
