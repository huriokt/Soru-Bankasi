package strinanipulations;

public class Q16_BasHarfler {
    public static void main(String[] args) {

/*
Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
Not: İkinci isim kapsam dışındadır.
Örnek: Tom Hanks ==> TH, Mary Star ==> MS                              */

        String tamIsim = "Tom Cemil Hank Jack";
        String ilk = tamIsim.split(" ")[0].substring(0,1);


        //int soyadIlkHarfIndex = isim.indexOf(" ") + 1;


        String sonHarf = tamIsim.split(" ")[tamIsim.split(" ").length-1].substring(0,1);


        System.out.println(ilk+sonHarf);










    }
}
