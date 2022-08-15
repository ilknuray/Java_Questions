package tum_Sorular;

import java.util.Scanner;

public class Soru_42 {
    public static void main(String[] args) {
        // kullanicidan bir cumle ve bir harf isteyin harfin cumlede var olup olmadigini yazdirin

        Scanner sc=new Scanner(System.in);
        String cumle= sc.nextLine();
        String harf= sc.next();

        if(cumle.indexOf(harf)==-1){
            System.out.println("girilen harf cumlede kullanilmamistir");

        }else{
            System.out.println("girilen harf cumlede kullanilmistir");
        }
    }
}
