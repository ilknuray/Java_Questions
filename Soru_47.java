package tum_Sorular;

public class Soru_47 {
    public static void main(String[] args) {
        //kullanicidan bir kelime isteyin ve ters yazdirin

        String str="mehmet";

        String ters=str.substring(6)+
               str.substring(5,6)+
                str.substring(4,5)+
                str.substring(3,4)+
                str.substring(2,3)+
                str.substring(1,2)+
                str.substring(0,1);
        System.out.println(ters);
    }
}
