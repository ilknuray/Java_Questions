package tum_Sorular;

public class Soru_52 {
    public static void main(String[] args) {
        //kullanicidan 100 den kucuk bir sayi isteyin
        //sayi 3 un kati ise java yazdirin
        //( in kati ise guzeldir yazdrin

        for (int i = 0; i <100 ; i++) {
            if(i%3==0){
                System.out.print("java" + " ");
            }else if(i%5==0){
                System.out.print("guzeldir" + " ");
            }else{
                System.out.print(i +" ");
            }

        }
    }
}
