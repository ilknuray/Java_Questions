package tum_Sorular;

import java.util.Scanner;

public class Soru_29 {
    public static void main(String[] args) {
        //kullanicidan maas icin icin bir teklif alin eger 80binin uzerinde ise kabul ediyorum
        //60-80arasinda ise dusunecegim
        //60dan azsa kabul edemem

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen maas teklifinizi giriniz");
        double maas= sc.nextDouble();

        if(maas>=80.000){
            System.out.println("kabul ediyorum");
        }else if(maas<80.000 || maas>=60.000){
            System.out.println("dusunmem lazim");
        }else{
            System.out.println("kabul edemem");
        }
    }
}
