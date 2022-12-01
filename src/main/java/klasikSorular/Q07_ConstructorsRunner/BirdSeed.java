package klasikSorular.Q07_ConstructorsRunner;
public  class BirdSeed {
               private int numberBags;
                boolean call;
                public BirdSeed() {
                this.numberBags = 11;
                call = false;
                }
                public BirdSeed(int numberBags) {
                this.numberBags = numberBags;
                this.call = true;
                }
            public static void main(String[] args) {

   //             Asagidak!lerden hang!s! yanlistir?
                BirdSeed seed = new BirdSeed();
                System.out.println(seed.numberBags);   //          Output 11 d!r//Dogru
                System.out.println();

                BirdSeed seed1 = new BirdSeed(7);
                System.out.println(seed1.numberBags);   //          Output 7 d!r//Dogru
                System.out.println();

                 BirdSeed seed2 = new BirdSeed();
                System.out.println(seed2.call);  //              Output false d!r//Dogru
                System.out.println();

                 BirdSeed seed3 = new BirdSeed(7);
                System.out.println(seed3.call);//G!ves Comp!le T!me Error. // Yanlis true verir





            }




    }
