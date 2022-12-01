package klasikSorular.abstrac_10;

 class Sub extends A {   /// Bu class i override etmek cozum olmadi override yada sorunlu method silinmeli

    int x = 4;
int getSum(){
        return x + x;
    }

     @Override
     int getSum(int x) {
         return 0;
     }


     int getSum(int x,int y){
        int z = x + y;
        System.out.print(z);
        return z;
    }



    public static void main(String[] args) {


        A sub = new Sub();
        sub.getSum(4,2);
    }
}
