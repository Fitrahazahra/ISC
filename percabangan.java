
package pitta;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
       
        // Percabangan if
        
        // Membuat variabel dan Scanner
        int belanja = 0;
        Scanner input = new Scanner(System.in);

        // Mengambil input
        System.out.print("Total Belanja: RP. ");
        belanja = input.nextInt();

        // Pengecekan belanja
        if (belanja > 300000) {
            System.out.println("Selamat Anda Mendapatkan Hadiah!...");
        }

        System.out.println("Terima kasih telah berbelanja di toko kami, jangan lupa untuk datang kembali.");
        
        // Percabangan if-else
        String nama;
        int nilai;
        Scanner input1 = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        nama = input1.nextLine();
        System.out.print("Masukkan Nilai: ");
        nilai = input1.nextInt();
        
        if (nilai >= 80) {
            System.out.println("Selamat " + nama + ", Anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", Anda Tidak Lulus!");
        }
        
        // Percabangan if-else dengan operator ternary
        boolean sukaNasiGoreng = true;
        String jawaban;
        
        jawaban = sukaNasiGoreng ? "iya" : "tidak";
        
        System.out.println(jawaban);
    }
}

    


