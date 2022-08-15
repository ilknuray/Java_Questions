package tum_Sorular;

import java.util.Scanner;

public class Soru_32 {
    public static void main(String[] args) {
        //kullanicidan iki sayi alin ve buyuk olani yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();

        if(sayi1>sayi2){
            System.out.println("sayi1 : " +sayi1);
        }else{
            System.out.println("sayi2 : " +sayi2);
        }
    }
}
