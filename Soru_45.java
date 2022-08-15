package tum_Sorular;

public class Soru_45 {
    public static void main(String[] args) {

        //"Java ogrenmek123 Cok guzel@"

        String str="Java ogrenmek123 Cok guzel@";

        System.out.println(str.replace('C','c').replaceAll("\\d","").replace('@','.'));
    }
}
