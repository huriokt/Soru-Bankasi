package klasikSorular;

public class Q4_WhileLoops {
    public static void main(String[] args) {


    char ch = 'a';
    while(ch<'d') {
        System.out.print(ch + " ");
        ch++;
    }
        System.out.println(" ==>Soru");
  //  Asagidak!lerden hang!ler!n!n ekran çiktisi yukaridak! !le aynidir?
    for(char i='a'; i<'d'; i++) {
        System.out.print(i + " ");
    }
        System.out.println("==> Sik A");


 //   System.out.print('a ' + 'b ' + 'c ');
  //  Not: a, b ve c harfler!nden sonra tek tirnagin !ç!nde b!r karakter bosluk vardir.
        System.out.println(" ==> Sik B");


     System.out.print('a' + " " + 'b' + " " + 'c' + " ");
 //   Not: C!ft tirnaklarin !ç!nde b!r karakter bosluk vardir.
        System.out.println(" ==> Sik C");

     System.out.print('a' + 'b' + 'c');
        System.out.println("  ==>Sik D");
}
}
