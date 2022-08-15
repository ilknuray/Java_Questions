package tum_Sorular;

public class Soru_46 {
    public static void main(String[] args) {
        //kuulanicidan bir isteyin
        //isim a iceriyorsa isim a harfi iceriyor
        //Z harfi iceriyorsa Z harfi iceriyor
        //ikiside yoksa girdiginiz isim a yada z icermiyor yazdirin

        String isim = "gazi";
        if (isim.contains("a")) {
            System.out.println("isim a harfi iceriyor");
        } else if (isim.contains("Z")) {
            System.out.println("isim Z harfi iceriyor");
        } else {
            System.out.println("isim a veya Z harfi icermiyor");

        }
    }
}