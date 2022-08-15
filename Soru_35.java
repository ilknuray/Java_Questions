package tum_Sorular;

import java.util.Scanner;

public class Soru_35 {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin sayi negatifse karesini pozitifse pozitif yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= sc.nextInt();

        if(sayi>0){
            System.out.println("pozitif sayi");
        }else{
            System.out.println(sayi*sayi);
        }
    }
}
