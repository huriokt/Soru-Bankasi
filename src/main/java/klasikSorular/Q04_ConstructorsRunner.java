package klasikSorular;

public class Q04_ConstructorsRunner {
    public static void main(String[] args) {
        //    Yukaridak! class'da 3 farkli constructor ver!lm!st!r.
//    Asagidak!lerden hang!s! yanlistir?
        Q04_Constructors.MyClass insan01 = new Q04_Constructors.MyClass();
        System.out.println("insan01.isim = " + insan01.isim);

//!nsan01 objes!n!n !sm! Al! Can olur.

        Q04_Constructors.MyClass insan02 = new Q04_Constructors.MyClass("Vel! Han");
        System.out.println("insan02.isim = " + insan02.isim);
        System.out.println("insan02.kilo = " + insan02.kilo);
        System.out.println("insan02.yas = " + insan02.yas);
//!nsan02 objes!n!n !sm! Vel! Han, yas! 33, k!losu 85 olur.
      //         Q04.MyClass insan03 = new Q04.MyClass(44, "Ayse Tan");
//!nsan03 objes!n!n !sm! Ayse Tan, yas! 44, k!losu 85 olur.


}
}
