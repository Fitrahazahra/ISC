package pitta;

public class fitra {

    public static void main(String[] args) {
        int nilai1 = 10;
        int nilai2 = 5;

        // operator aritimatika
        System.out.println(nilai1 + nilai2);
        System.out.println(nilai1 - nilai2);
        System.out.println(nilai1 * nilai2);
        System.out.println(nilai1 / nilai2);
        System.out.println(nilai1 % nilai2);

        // operator penugasan
        int nilai = 10;
        System.out.println(nilai);
        nilai += 5;
        System.out.println(nilai);
        nilai -= 3;
        System.out.println(nilai);
        nilai *= 2;
        System.out.println(nilai);
        nilai /= 6;
        System.out.println(nilai);
        nilai &= 2;
        System.out.println(nilai);

        //operator perbandingan
        int nilai3 = 10;
        int nilai4 = 5;
        System.out.println(nilai3 == nilai4);
        System.out.println(nilai3 != nilai4);
        System.out.println(nilai3 > nilai4);
        System.out.println(nilai3 < nilai4);
        System.out.println(nilai3 >= nilai4);
        System.out.println(nilai3 <= nilai4);

        //Operator logika
        boolean a = true;
        boolean b = false;
        boolean c;

        // kongjungsi (AND)
        c = a && b;
        System.out.println("true && false =" + c);

        //Dujungsi(OR)
        c = a || b;
        System.out.println("true || false =" + c);

        //Negasi (NOT)
        System.out.println("Negasi !true =" + !a);
        System.out.println("Negasi !flase =" + !b);

        // Operator Bitwise
        int d = 60;
        int f = 13;
        int g = 0;

        g = d & f;
        System.out.println("d & f = " + g);

        g = d | f;
        System.out.println("d | f = " + g);

        g = d ^ f;
        System.out.println("d ^ f = " + g);

        g = ~d;
        System.out.println("~d = " + g);

        g = d;
        System.out.println("d << 2 = " + g);

        g = d >> 2;
        System.out.println("d >> 2  = " + g);

        g = d >>> 2;
        System.out.println("d >>> 2 = " + g);
       

        // Operator Ternary
        boolean suka = true;
        String jawaban;

        //menggunakan opertor ternary
        jawaban = suka ? "iya" : "tidak";

        //manpilkan jawaban
        System.out.println(jawaban);

    }

}
