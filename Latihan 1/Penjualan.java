import java.util.Scanner;

    public class Penjualan {
        private String kode;
        private String nama;
        private float harga;
        private int jumlah;

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian() {
    return harga * jumlah;
}

    public String getBonus() {
    if (getTotalPembelian() >= 500000 && jumlah > 5) {
        return "Setrika";
    } else if (getTotalPembelian() >= 100000 && jumlah > 3) {
        return "Payung";
    } else if (getTotalPembelian() >= 50000 || jumlah > 2) {
        return "Ballpoint";
    } else {
        return "Tidak ada bonus";
        }
    }
}