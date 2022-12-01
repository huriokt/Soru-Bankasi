package klasikSorular;

public class Q04_Constructors {
    public static class MyClass {
        String isim = "Ali Can";
        int yas = 33;
        int kilo = 85;

        MyClass() {
        }

        MyClass(String isim, int yas) {
            this.isim = isim;
            this.yas = yas;
        }

        MyClass(String isim) {
            this.isim = isim;
        }
    }

}
