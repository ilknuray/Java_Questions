package tum_Sorular;

import java.util.Scanner;

public class Soru_30 {
    public static void main(String[] args) {
        //kullanicidan bir sifre girmesini isteyin
        //eger ilk harf buyuk harf ise "a" olup olmadigini kontrol edin
        //ilk harf a ise gecerli sifre degilse gecersiz sifre yazin

        //eger ilk harf kucuk harf ise "z"olup olmadigini kontrol edin
        //z ise gecerli sifre degilse gecersiz sifre yazdirin


        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen  bir sifre giriniz");
        char ilkHarf= sc.next().charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z') {
            if (ilkHarf == 'A') {
                System.out.println(" gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }
        }else if(ilkHarf>='a' && ilkHarf<='z'){
            if(ilkHarf == 'z'){
                System.out.println("gecerli sifre");
            }else{
                System.out.println("gecersiz sifre");
            }
        }
    }
}
