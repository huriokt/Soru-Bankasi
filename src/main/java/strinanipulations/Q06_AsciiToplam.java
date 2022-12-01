package strinanipulations;

public class Q06_AsciiToplam {
    public static void main(String[] args) {

/*Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
toplamını bulunuz.String s = "Miami";   182*/


        String s = "Miami";
        String ilk = s.substring(0,1);
        String son = s.substring(s.length()-1);
        Character ch1 = ilk.charAt(0);
        Character ch2 = son.charAt(0);
        System.out.println(ch1+ch2);


        /*int sonKrkIndex = s.length()-1;
        int ilkKrkAscii= s.charAt(0);
        int sonKrkAscii = s.charAt(sonKrkIndex);
        System.out.println("ilk ve son karakterlerin ASCII degerlerinin toplami: " + (ilkKrkAscii +
                sonKrkAscii));*/
















    }
}
