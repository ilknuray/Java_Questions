package tum_Sorular;

import java.util.Scanner;

public class Soru_36 {
    public static void main(String[] args) {

      //kullanicidan dikdortgenin kenar uzunluklarini alin ve karemi degilmi kontrol edin

        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        String sonuc=(a==b)?("kare"):("dikdortgen");
        System.out.println(sonuc);



        }
    }

