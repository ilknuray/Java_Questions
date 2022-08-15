package tum_Sorular;

import java.util.Scanner;

public class Soru_55 {
    public static void main(String[] args) {
        //kullanicidan bir strng isteyin ve tersten yazdirin
        String input="Bugun bayram erken kalkin cocuklar";
        tersCevir(input);

    }

    public static void tersCevir(String input) {

        String tersInput=input.substring(input.length()-1);

        for (int i =input.length()-2; i >=0; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);
    }


}

