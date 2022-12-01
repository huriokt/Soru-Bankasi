package klasikSorular;

public class Q08_StringMethodForLoops { public static void main(String[] args) {


    String s = "Java !s Java";


    //    Hang!s! dogrudur?
    System.out.println(s.indexOf('a'));
    //      Ekrana 2 yazdırır

    System.out.println(s.indexOf("Java"));
    //     Ekrana 0 yazdırır

    System.out.println(s.indexOf('a', 4));
    //       Ekrana 10 yazdırır

    System.out.println(s.indexOf("va", 2));
    //       Ekrana 10 yazdırır
}
}
