package tum_Sorular;

public class Soru_62 {
    public static void main(String[] args) {
        //for loop ve while loop kullanarak 3 basamakli sayilardan 15 20 ve 90 a
        //tam bolunen sayilari yaziniz

        int sayi = 360;
        for (int i = 1; i <= sayi; i++) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {

                System.out.print(i + " ");

            }
        }
    }}
