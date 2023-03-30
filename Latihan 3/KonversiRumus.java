import java.util.Scanner;

public class KonversiRumus {

    public static void main(String[] args) throws Exception {
       
        boolean cek = true;
        do{
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Detik : ");
        int dtk = input.nextInt();

        Konversi konvers = new Konversi();
        
        int Hari = konvers.getHari(dtk);
        int Jam = konvers.getJam(dtk);
        int Menit = konvers.getMenit(dtk);
        int Detik = konvers.getDetik(dtk);

        System.out.println(" hasilkonversi");
        System.out.println("Hari = " + Hari);
        System.out.println("Jam = " + Jam);
        System.out.println("Menit = " + Menit);
        System.out.println("Detik = " + Detik);
        char lagi = input.next().charAt(0);
        
        System.out.println("\n \n ");
        System.out.print("Apakah ingin input lagi? [Y/T]");
        
        if (lagi=='T')
        {
            cek = false;
        }

        }
        while(cek);
    }
}
