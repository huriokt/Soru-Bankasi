package klasikSorular.abstrac_01;

public class Test extends Ab01{

        public void set(int a){
            this.a = a;
        }

    @Override//Soruda bu kisim override edilmedigi icin hata veriyor
    public void get() {

    }

    public static void man(String[] args){
            Test obj = new Test();
            obj.set(20);
            System.out.println(obj.a);
        }

}
