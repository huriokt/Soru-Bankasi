package klasikSorular.interface01_3;

public class Test01 implements I02 {
   int x = 3;
    char c = 'B';
    public void myMethod() {
        System.out.println("No parameter: " + I02.c + x);
    }
    public void myMethod(char c, int x) {
        System.out.println("One parameter: " + c + I02.x);
    }

    public static void main(String[] args) {


        Test01 obj = new Test01();
        obj.myMethod();
        obj.myMethod('Z', 7);
    }
}
//    Output ned!r?
//        A) No parameter: A3
//        One parameter: Z2
//        B) No parameter: B3
//        One parameter: Z7
//        C) No parameter: A2
//        One parameter: Z2
//        D) No parameter: A3
//        One parameter:
//        }
