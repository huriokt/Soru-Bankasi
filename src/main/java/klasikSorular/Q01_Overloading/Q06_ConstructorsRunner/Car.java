package klasikSorular.Q01_Overloading.Q06_ConstructorsRunner;

public class Car {
    int price = 50;

    public Car(int price) {
        this.price = price;
    }

//    Car(){   }


    public static void main(String[] args) {
        //       Hang!s! ekrana 50 yazar?

        Car c1 = new Car(50);
        System.out.println(c1.price);
        System.out.println();

//        Car c2 = new Car();
//        System.out.println(c2.price);
//        System.out.println();
//
//        Car c3 = new Car(50);
//        System.out.println(c3);
//        System.out.println();
//
//        Car c4 = new Car();
//        System.out.println(c4);

    }
}