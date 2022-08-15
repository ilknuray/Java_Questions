package tum_Sorular;

public class Soru_56 {
    public static void main(String[] args) {
        //kullanicidan bir string isteyin ve palindrom olup olmadigini
        //kontrol eden bir program yazin
        String input="AdA";
        plindromKontrol(input);
    }

    public static void plindromKontrol(String input) {
        String tersiAyni="";
        for (int i = input.length()-1; i>=0; i--) {
            tersiAyni += input.charAt(i);
        }

            if(tersiAyni.equals(input)){
                System.out.println("girilen kelime palindrom");
            }else {
                System.out.println("girilen kelime palindrom degil");
            }

        }

    }
