package tum_Sorular;

import java.util.Scanner;

public class Soru_26 {
    public static void main(String[] args) {
        //kullanicidan bir ucgenin uc kenar uzunlugunu alin ve birbirine esitse
        //eskenar degilse degil yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1= sc.nextDouble();
        double kenar2= sc.nextDouble();
        double kenar3= sc.nextDouble();

        if (kenar1==kenar2 &&kenar2==kenar3 &&kenar1==kenar3){
            System.out.println("eskenar ucgen");
        }else{
            System.out.println("eskenar ucgen degil");
        }

    }
}
