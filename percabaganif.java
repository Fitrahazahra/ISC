package pitta;

import java.util.Scanner;

public class percabaganif {

    public static void main(String[] args) {
        // percabangan if
        
        //membuat variabel dan Scanner
        int belanja = 0;
        Scanner input = new Scanner(System.in);

        //mengambil input
        System.out.println("Total Belanja: RP. ");
        belanja = input.nextInt();

        //pengecekan belanja
        if (belanja > 300000) {
            System.out.println("Selamat Anda Mendapatkan HadiaH!...");
        }

        System.out.println("Terimah Kasih telah belanja di Tokoh kami,jgn lupa untuk datang kembali ");
        
        // percabanganifElse
        String nama;
        int nilai;
        Scanner input1 = new Scanner (System.in);
        
        System.out.println("Masukan Nama: ");
        nama = input.next();
        System.out.println("Masukan Nilai");
        nilai = input.nextInt();
        
        if(nilai >= 80){
            System.out.println("Selamat untuk " + nama +",Anda lulus!");
        }else {
            System.out.println("Maaf" + nama +", Anda Tidak Lulus!");
        }
        
        //percabanganifElseWithOperatorTernary
        
        boolean sukaNasiGoreng = true;
        String jawaban;
        
        jawaban = sukaNasiGoreng ?"iya" : "tidak";
        
        System.out.println(jawaban);
        
        
            
        

    }

}
