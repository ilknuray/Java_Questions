package tum_Sorular;

import java.util.Scanner;

public class Soru_23 {
    public static void main(String[] args) {
        //kullanicidan gun ismini alip hafta icimi hafta sonu mu yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gunIsmi= sc.next();

        if(gunIsmi.equals("cumartesi,pazar")){
            System.out.println("haftasonu");
        }else{
            System.out.println("haftaici");
        }
    }
}
