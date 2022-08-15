package tum_Sorular;

import java.util.Scanner;

public class Soru_27 {
    public static void main(String[] args) {
        //kullanicidan gun ismini yazmasini isteyin eger gecerli bir gun ise
        //gun isimlerinin 1,2,3.harflerini ilk harf buyuk digerleri kucuk olacak sekilde
        //gecerl gun ismi degilse gecerli degil yazdirn

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= sc.next().toLowerCase();

        if(gunIsmi.equals("pazatesi")){
            System.out.println("Paz");
        }else if(gunIsmi.equals("sali")){
            System.out.println("Sal");
        }else if(gunIsmi.equals("carsamba")){
            System.out.println("Car");
        }else if(gunIsmi.equals("persembe")){
            System.out.println("Per");
        }else if(gunIsmi.equals("cuma ,cumartesi")){
            System.out.println("Cum");
        }else if(gunIsmi.equals("pazar")){
            System.out.println("Paz");
        }else{
            System.out.println("Gecerli bir gun giriniz");
        }
    }
}
