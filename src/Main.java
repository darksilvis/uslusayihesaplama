import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,kuvvet;
        int total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("tabani giriniz: ");
        taban = input.nextInt();

        System.out.print("üssü giriniz: ");
        kuvvet = input.nextInt();

        for(int i=1;i<=kuvvet;i++){
            total*=taban;
        }

        System.out.print("sonuç:" +total);


    }
}