
package pitta;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class membuatdaftrbelanja {

    public static void main(String[] args) {
       
        // Daftar menu dan harga
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Nasi Goreng", 12000);
        menu.put("Gado-Gado", 11000);
        menu.put("Ayam Goreng", 18000);
        menu.put("Soto Ayam", 15000);
        menu.put("Bakso", 10000);

        // Pesanan pengguna
        Map<String, Integer> pesanan = new HashMap<>();
        int total_harga = 0;

        // Fungsi untuk menampilkan daftar menu
        System.out.println("Menu Makanan:");
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ": Rp " + entry.getValue());
        }

        // Fungsi untuk memproses pesanan
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMasukkan pesanan anda (atau ketik 'selesai' untuk mengakhiri pesanan):");
            String makanan = scanner.nextLine();

            if (makanan.equals("selesai")) {
                break;
            }

            if (menu.containsKey(makanan)) {
                System.out.print("Jumlah pesanan: ");
                int jumlah = scanner.nextInt();
                if (jumlah > 0) {
                    pesanan.put(makanan, pesanan.getOrDefault(makanan, 0) + jumlah);
                    total_harga += (menu.get(makanan) * jumlah);
                } else {
                    System.out.println("Jumlah pesanan harus lebih dari 0.");
                }
            } else {
                System.out.println("Menu tidak tersedia. Silakan coba lagi.");
            }
        }

        System.out.println("\nPesanan Anda:");
        for (Map.Entry<String, Integer> entry : pesanan.entrySet()) {
            String makanan = entry.getKey();
            int jumlah = entry.getValue();
            int harga = menu.get(makanan);
            int subtotal = harga * jumlah;
            System.out.println(makanan + " (" + jumlah + " x Rp " + harga + "): Rp " + subtotal);
        }

        System.out.println("Total Harga: Rp " + total_harga);

        scanner.close();
    }
}
    
        
    

