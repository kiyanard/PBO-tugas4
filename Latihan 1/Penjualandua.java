import java.util.Scanner;

public class Penjualandua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Masukkan kode barang : ");
            String kode = input.next();
            
            System.out.print("Masukkan nama barang : ");
            String nama = input.next();
            
            System.out.print("Masukkan harga barang : ");
            float harga = input.nextFloat();
            
            System.out.print("Masukkan jumlah barang : ");
            int jumlah = input.nextInt();

            Penjualan penjualan = new Penjualan();
            penjualan.setData(kode, nama, harga, jumlah);

            System.out.println("========== Nota Pembelian ==========");
            System.out.println("Kode Barang : " + kode);
            System.out.println("Nama Barang : " + nama);
            System.out.println("Harga Barang : " + harga);
            System.out.println("Jumlah Barang : " + jumlah);
            System.out.println("Total Pembelian : " + penjualan.getTotalPembelian());
            System.out.println("Bonus : " + penjualan.getBonus());
            System.out.print("Input data lagi [Y/T] ? ");
        } while (input.next().equalsIgnoreCase("Y"));

        input.close();
    }
}