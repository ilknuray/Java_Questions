package tum_Sorular;

public class Soru_8 {
    public static void main(String[] args) {
        //verilen sayi1 ve sayi2 variablelarinin degerlerini 3.bir deger olmadan degistirin

        int sayi1=10;
        int sayi2=20;

        sayi2=sayi1+sayi2;
        sayi1=sayi2-sayi1;
        sayi2=sayi2-sayi1;
        System.out.println("sayi1 = " + sayi1 +" " + "sayi2 = "+sayi2) ;
    }
}
