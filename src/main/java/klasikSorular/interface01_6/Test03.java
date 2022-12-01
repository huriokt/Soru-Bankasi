package klasikSorular.interface01_6;

public class Test03 {
    int x;

    public void cal(int item) {
        x = item * item;
    }

    public static void main(String[] args) {


        Test03 obj = new Test03();
        obj.cal(I03.x);
        System.out.println(obj.x);
        obj.cal(I02.x);
        System.out.println(obj.x);
    }
}