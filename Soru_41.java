package tum_Sorular;

import java.util.Scanner;

public class Soru_41 {
    public static void main(String[] args) {
        //kullanicidan sdet kisaltmasindaki harflerden birini girmesini isteyin
        //s girerse sofware
        //d girerse developer
        //e girerse engineer
        //t girerse tester yazdirin

        Scanner scan = new Scanner(System.in);
        char harf = scan.next().charAt(0);


        switch (harf) {
            case 'S':
                System.out.println("software");
                break;
            case 'D':
                System.out.println("developer");
                break;
            case 'E':
                System.out.println("engineer");
                break;
            case 'T':
                System.out.println("tester");
                break;

        }
    }}
