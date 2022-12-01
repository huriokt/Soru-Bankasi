package klasikSorular.Q01_Overloading;

public class C {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.disply();
        System.out.println(obj1.i);
        System.out.println("------------");

        A obj2 = new B();
        obj2.disply();
        System.out.println(obj2.i);
        System.out.println("--------------");

        A obj3= new A();
        obj3.disply();
        System.out.println(obj3.i);

     //   B obj4= new A();   Izin vermedi altini cizdi



    }





}
