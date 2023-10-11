package pitta;

public class mainn {

    public static void main(String[] args) {

        //  konversi  string ke tipe data primitif
        String angkaStr = "125";
        String byteStr = "120";
        String booleanStr = "true";

        // Konversi string int
        int angka = Integer.parseInt(angkaStr);

        // Konversi string ke byte
        byte nilaiByte = Byte.parseByte(byteStr);

        // Konversi string ke boolean
        boolean nilaiBoolean = Boolean.parseBoolean(booleanStr);

        // Tampilkan hasil konversi
        System.out.println("Konversi string ke int: " + angka);
        System.out.println("Konversi string ke byte: " + nilaiByte);
        System.out.println("Konversi string ke boolean: " + nilaiBoolean);

        //  konversi tipe data primitif ke string
        int angka1 = 345;
        double nilai2Double = 35.67;
        boolean nilai2Boolean = true;

        // Konversi int ke string
        String angka1Str = Integer.toString(angka1);

        // Konversi double ke string
        String doubleStr = Double.toString(nilai2Double);

        // Konversi boolean ke string
        String booleanStr2 = Boolean.toString(nilai2Boolean);

        // Tampilkan hasil konversi
        System.out.println("Konversi int ke string: " + angka1Str);
        System.out.println("Konversi double ke string: " + doubleStr);
        System.out.println("Konversi boolean ke string: " + booleanStr2);

    }

    public mainn() {
    }
}
