package ifStatement;

public class Soru5_UcgenCesitleri {
    public static void main(String[] args) {

        /*Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
                b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
                c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"*/
        int a = 5;
        int b = 3;
        int c = 4;
        if (a == b && b == c) {
            System.out.println("Eskenar Ucgen");
        } else if (a == b && b != c || a == c && b != c || b == c && a != c) {
            System.out.println("Ikizkenar Ucgen ");
        } else {
            System.out.println("Cesit Kenar Ucgen ");

        }
    }
}
