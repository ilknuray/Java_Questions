package tum_Sorular;

import java.util.Scanner;

public class Soru_24 {
    public static void main(String[] args) {
        //dikdortgenin kenar uzunluklarini giriniz ve kare olup olmadigini
        //kontrol ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("diktortgenin kenar uzunluklarini giriniz");
        double kenar1= sc.nextDouble();
        double kenar2= sc.nextDouble();

        if(kenar1==kenar2){
            System.out.println("kare");
        }else{
            System.out.println("dikdortgen");
        }
    }
}
