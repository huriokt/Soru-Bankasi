package klasikSorular.interface02_1;

public class Cat implements Animal, Mammal {
    public static void main(String[] args) {


        Cat cat = new Cat();
        System.out.println(Animal.x);
        cat.eat();
    }

    @Override
    public void eat() {
        System.out.println("Cats l!ke cheese");
    }
}
//        Output
//        5
//        Cats like cheese

