package pitta;

import java.util.Scanner;

public class PerulanganDay13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilih 1 untuk melanjutkan ngoding dan 0 untuk berhnenti ngoding ");
            pilihan = input.nextInt();
        } while (pilihan != 1);

        System.out.println("Anda telah melanjutkan ngoding ");

    }

}
