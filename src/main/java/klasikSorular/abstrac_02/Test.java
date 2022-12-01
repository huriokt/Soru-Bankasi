package klasikSorular.abstrac_02 ;



public class Test extends Ab01 {

        public void set(int a){
            this.a = a;
        }



    public static void main(String[] args){
            Test obj = new Test();
            obj.set(20);
            System.out.println(obj.get());
        }

}
