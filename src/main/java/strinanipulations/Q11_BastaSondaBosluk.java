package strinanipulations;

public class Q11_BastaSondaBosluk {
    public static void main(String[] args) {
/*
        Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
        yazınız.
                Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
                ‘’ için kodunuz konsolda true yazmalıdır                   */


        String str=" Ali" ;
        String str1 = "Ali";
        boolean bosstr =str.length()-str.trim().length()>0;
        System.out.println(bosstr);
        boolean bosstr1 =str1.length()-str1.trim().length()>0;
        System.out.println(bosstr1);

     /*   String s = " Tom ";
        String trimlenmis = s.trim();
        Boolean sonuc = s.equals(trimlenmis);
        System.out.println("basinda ve sonunda bosluk var mi : " + !sonuc);             */








    }
}
