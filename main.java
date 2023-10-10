package PITTO;

public class main {

    public static void main(String[] args) {

        //perbedaan dari primatif dan non primatif
        // Tipe data primitif merepresentasikan nilai dasar secara langsung. Misalnya, variabel bertipe int akan langsung menyimpan angka bulat, dan variabel bertipe boolean akan menyimpan true atau false.
        //Tipe data non-primitif merepresentasikan referensi ke objek yang menyimpan data. Misalnya, variabel bertipe String adalah referensi ke objek String yang berisi teks.
        // Tipe data primitif
        int angkaBulat = 35;            // Mendeklarasikan variabel angkaBulat dan menginisialisasinya dengan nilai 35
        double angkaPecahan = 3.14;     // Mendeklarasikan variabel angkaPecahan dan menginisialisasinya dengan nilai 3.14
        boolean booleanPrimitif = false; // Mendeklarasikan variabel booleanPrimitif dan menginisialisasinya dengan nilai false

        // Tipe data non-primitif 
        String nama = "fitrah";         // Mendeklarasikan variabel nama dan menginisialisasinya dengan string "fitrah"
        Integer umur = 20;              // Mendeklarasikan variabel umur dan menginisialisasinya dengan objek Integer berisi nilai 20
        Double tinggi = 152.0;          // Mendeklarasikan variabel tinggi dan menginisialisasinya dengan objek Double berisi nilai 152.0
        Boolean sudahpunyapacar = false; // Mendeklarasikan variabel sudahpunyapacar dan menginisialisasinya dengan objek Boolean berisi nilai false

        // Menampilkan nilai tipe data primitif
        System.out.println("Tipe Data Primitif:");
        System.out.println("Angka bulat: " + angkaBulat);          // Menampilkan nilai variabel angkaBulat
        System.out.println("Angka Pecahan Primitif: " + angkaPecahan); // Menampilkan nilai variabel angkaPecahan
        System.out.println("Boolean Primitif: " + booleanPrimitif);   // Menampilkan nilai variabel booleanPrimitif

        // Menampilkan informasi menggunakan tipe data non-primitif
        System.out.println("Nama: " + nama);                   // Menampilkan nilai variabel nama
        System.out.println("Umur: " + umur);                   // Menampilkan nilai variabel umur
        System.out.println("Tinggi: " + tinggi + " cm");       // Menampilkan nilai variabel tinggi
        System.out.println("Sudah punya pacar: " + sudahpunyapacar); // Menampilkan nilai variabel sudahpunyapacar
    }
}
