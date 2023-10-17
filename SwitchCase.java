package pitta;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilih;
        System.out.println("---malam rabu ngoding r---\n");
        System.out.print("Kamu pilih aku atau dia ??? ");
        pilih = in.nextLine();
        switch (pilih) {
            case "aku":
                System.out.print("\nAku pasti akan lebih baik dari pada dia !");
                break;
            case "dia":
                System.out.print("Lebih baik aku SD, sadar diri");
                break;
        }
    }
}
