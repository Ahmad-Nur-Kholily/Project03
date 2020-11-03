package tebakangka;
import java.util.Random;
import java.util.Scanner;
public class Tebak {
    int tebakan;
    int jawaban;
    void guess(){
        Random x = new Random();
        this.jawaban = x.nextInt(99);
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Coba tebak : ");
            this.tebakan = input.nextInt();
            if (this.tebakan > this.jawaban){
                System.out.println("Tebakanmu lebih besar dari jawaban");
            }else if (this.tebakan < this.jawaban){
                System.out.println("Tebakanmu lebih kecil dari jawaban");
            }else{
                System.out.println("WAOW, tebakanmu benar!!!");
            }
        }while (this.tebakan != this.jawaban);
    }
}