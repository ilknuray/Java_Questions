package tum_Sorular;

public class Soru_68 {
    public static void main(String[] args) {
        //'m' harfinden baslayip 'c' harfine kadar olan tum harfleri yazdirin
        char ilkHarf='m';
        char sonHarf='c';

        char temp=ilkHarf;

        while (temp>=sonHarf){
            System.out.println(temp);
            temp--;
        }


        }

    }