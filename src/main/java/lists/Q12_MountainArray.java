package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12_MountainArray {
    public static void main(String[] args) {
/*
        Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod yazınız.
   Not:
        Mountain Array ==> [0, 2, 5, 3, 1]
        Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli
        azalan değer alıyorsa Mauntain Array' dir.
        Mountain Array Değil ==> [5, 2, 7, 1, 4]
        Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra sürekli
        artan değer alıyorsa Mauntain Array değildir.                         */

        List<Integer> mont = new ArrayList<>(Arrays.asList(5, 2, 7, 1, 4));
        System.out.println(mont);

        int enBuyukEleman = mont.get(0);
        int counter = 0;
        int flag = 0;

        for (int i = 0; i < mont.size(); i++) {
            enBuyukEleman = Math.max(enBuyukEleman, mont.get(i));

        }
        System.out.println(enBuyukEleman);
        System.out.println(mont.indexOf(enBuyukEleman));
        System.out.println(mont.size());

            for (int j = 0; j < mont.indexOf(enBuyukEleman); j++) {

                if (mont.get(j + 1) > mont.get(j)) {
                    counter++;
                }
            }
                for (int k = mont.indexOf(enBuyukEleman); k < mont.size()-1; k++) {

                    if (mont.get(k) > mont.get(k+1)) {
                        flag++;
                    }
                }
                    if ((counter == mont.indexOf(enBuyukEleman)) && (flag == mont.indexOf(enBuyukEleman))) {
                        System.out.println("mont arry");
                    } else System.out.println("mont degil");


//////////////////////2.YOL///////////////

//Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
//yazınız.
//
//        int arr[] = {0,1,2,5,3,2,1};
//        List<Integer> list = new ArrayList<>();
//
//        for(int w : arr) {
//            list.add(w);
//        }
//
//        int enBuyuk = 0;
//        int mountainArrayMi = 1;
//
//        for (Integer w : list) {
//            enBuyuk = Math.max(enBuyuk, w);
//        }
//        int enBuyukIdx = list.indexOf(enBuyuk);
//
//        for(int i = 0; i < enBuyukIdx; i++) {
//            if(list.get(i) > list.get(i+1)){
//                mountainArrayMi = 0;
//                break;
//            }
//        }
//
//        if(mountainArrayMi == 1) {
//            for(int i = list.size()-1; i > enBuyukIdx; i--) {
//                if(list.get(i) > list.get(i-1)){
//                    mountainArrayMi = 0;
//                    break;
//                }
//            }
//        }
//
//        String sonuc = mountainArrayMi == 0 ? "Mountain Array degildir"
//                : "Mountain Arraydir";
//        System.out.println(sonuc);



    }
}
