package tum_Sorular;

import java.util.Scanner;

public class Soru_44 {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyin
        //cumle buyuk kelimesi iceriyorsa tum cumleyi buyuk kucuk kelimesi iseriyorsa tum cumleyi buyuk yazdirin
        //iki kelimeyi de icermiyorsa cumle buyuk yada kucuk kelimesi icemiyor yazdirin

        Scanner sc=new Scanner(System.in);
        String cumle= sc.nextLine();

        if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("cumle kucuk yada buyuk kelimelerini icermiyor");
        }
    }
}
