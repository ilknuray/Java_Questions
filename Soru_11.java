package tum_Sorular;

import java.util.Scanner;

public class Soru_11 {
    public static void main(String[] args) {
        //kullanicidan yaricap isteyip cemberin cevresini ve alanini hesaplayip yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double r= sc.nextDouble();
        double cevre=2*3.14*r;
        double alan=3.14*r*r;
        System.out.println("alan : " + alan +"\ncevre : " +cevre);
    }
}
