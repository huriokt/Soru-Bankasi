package klasikSorular.interface01_1;

public class Test01 implements I01{
    public static void main(String[] args) {


 Test01 obj = new Test01();
        System.out.println(obj.myMethod());

    }

    @Override
    public int myMethod() {
        return 12;
    }
}
