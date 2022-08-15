package tum_Sorular;

public class Soru_67 {
    public static void main(String[] args) {
        //9dan 190a kadar olan ve7 ye tam bolunebilen sayilari ekrana yazdiriniz

        int bas=9;
        int bitis=190;


        for (int i =bas; i <=bitis ; i++) {
            if (i%7==0){
                System.out.println(i);
            }

        }
    }
}
