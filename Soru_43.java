package tum_Sorular;

import java.util.Scanner;

public class Soru_43 {
    public static void main(String[] args) {

        //kullanicidan bir kelime ve bir cumle isteyin
        //girilen kelime kullanilmamis
        //bir kere kullanilmis
        //birden fazla kullanilmis

        Scanner sc=new Scanner(System.in);
        String cumle= sc.nextLine();
        String kelime= sc.next();

        int ilkIndex=cumle.indexOf(kelime);
        int lastIndex=cumle.lastIndexOf(kelime);


        if(ilkIndex==-1){
            System.out.println("kelime cumlede kullanilmamis");
        }else if(ilkIndex==lastIndex){
            System.out.println("kelime birkere kullanilmis");
        }else{
            System.out.println("kelime birden fazla kullanilmis");
        }
    }
}
