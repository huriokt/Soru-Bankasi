package strinanipulations;

public class Q17_NoktalamaSayisi {
    public static void main(String[] args) {

/*
        Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
        String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";                                */



        String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
        int uzunluk = s.length();
        int ch= s.replaceAll("\\p{Punct}","").length();
        System.out.println(uzunluk-ch);









    }
}
