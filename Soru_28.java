package tum_Sorular;

import java.util.Scanner;

public class Soru_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen iki tamsayi giriniz");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        
        if(sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        }else if(sayi1<0 && sayi2<0){
            System.out.println(sayi1*sayi2);
        }else if((sayi1>0&& sayi2<0)||(sayi1<0&&sayi2>0)){
            System.out.println("farkli isaretlerle islem yapilamaz");
        }else if(sayi1==0 || sayi2==0){
            System.out.println("0 carpmaya gore yutan elemandir");
        }
    }
}
