import com.example.kalkulator.Kalkulator;

public class Driver {

    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Hasil awal adalah: " + kalkulator.dapatkanHasil());

        kalkulator.tambah(9); 

        System.out.println("Hasil setelah ditambah 9 adalah: " + kalkulator.dapatkanHasil());

        kalkulator.tambah(3); 

        System.out.println("Hasil setelah ditambah 3 adalah: " + kalkulator.dapatkanHasil());

        kalkulator.kali(2);

        System.out.println("Hasil setelah dikalikan 2 adalah: " + kalkulator.dapatkanHasil());

    }
}
