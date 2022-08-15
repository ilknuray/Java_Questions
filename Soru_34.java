package tum_Sorular;

import java.util.Scanner;

public class Soru_34 {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= sc.nextInt();

        if(sayi>0){
            System.out.println(sayi);
        }else if(sayi<0){
            System.out.println(-sayi);
        }
    }
}
