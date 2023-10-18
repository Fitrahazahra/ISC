package pitta;

import java.util.Scanner;

public class menentukangajikaryawan {

    public static void main(String[] args) {

        // Deklarasi variabel
        Scanner input = new Scanner(System.in);
        String golongan;
        int lamaKerja;
        int gajiPokok;
        int bonus;

        // Input golongan
        System.out.print("Masukkan golongan karyawan: ");
        golongan = input.nextLine();

        // Input lama kerja
        System.out.print("Masukkan lama kerja karyawan (tahun): ");
        lamaKerja = input.nextInt();

        // Hitung gaji pokok
        switch (golongan) {
            case "I":
                gajiPokok = 4000000;
                break;
            case "II":
                gajiPokok = 7000000;
                break;
            case "III":
                gajiPokok = 10000000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return;
        }

        // Hitung bonus
        if (lamaKerja > 5) {
            bonus = lamaKerja * 100000;
        } else {
            bonus = 0;
        }

        // Cetak gaji bersih
        System.out.println("Gaji bersih karyawan adalah: " + (gajiPokok + bonus));

    }
}
