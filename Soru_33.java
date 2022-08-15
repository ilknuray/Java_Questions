package tum_Sorular;

import java.util.Scanner;

public class Soru_33 {
    public static void main(String[] args) {
        //kullanicidan bir tamsayi alin ve tek mi cift mi yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= sc.nextInt();

        if(sayi%2==0){
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");
        }
    }
}
