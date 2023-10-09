package ISCI100DAY;

public class main {

    public static void main(String[] args) {
        // Deklarasi variabel dengan tipe data
        int angkaBulat = 42;
        double angkaPecahan = 3.14;
        String teks = "Halo, dunia!";
        boolean benar = true;

        // Menampilkan nilai variabel
        System.out.println("Angka bulat: " + angkaBulat);
        System.out.println("Angka pecahan: " + angkaPecahan);
        System.out.println("Teks: " + teks);
        System.out.println("Boolean: " + benar);

        // Menggunakan variabel untuk operasi
        int hasilPenjumlahan = angkaBulat + 10;
        double hasilPengurangan = angkaPecahan - 1.0;

        // Menampilkan hasil operasi
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil pengurangan: " + hasilPengurangan);

        // Menggabungkan teks
        String namaDepan = "John";
        String namaBelakang = "Doe";
        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println("Nama lengkap: " + namaLengkap);
    }
}

}
