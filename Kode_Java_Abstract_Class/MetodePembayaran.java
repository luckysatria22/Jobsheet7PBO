public abstract class MetodePembayaran {
    protected String idTransaksi;
    protected String namaPelanggan;
    protected double jumlah;

    public MetodePembayaran(String idTransaksi, String namaPelanggan, double jumlah) {
        this.idTransaksi = idTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.jumlah = jumlah;
    }

    // Abstract method: wajib di-override oleh setiap subclass
    public abstract double hitungBiayaAdmin();

    public abstract void prosesPembayaran();

    // Concrete method: dipakai bersama oleh semua subclass
    public double hitungTotal() {
        return jumlah + hitungBiayaAdmin();
    }

    // Concrete method
    public void cetakStruk() {
        System.out.println("===== STRUK PEMBAYARAN =====");
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Pelanggan    : " + namaPelanggan);
        System.out.println("Jumlah       : Rp" + String.format("%,.0f", jumlah));
        System.out.println("Biaya Admin  : Rp" + String.format("%,.0f", hitungBiayaAdmin()));
        System.out.println("Total Bayar  : Rp" + String.format("%,.0f", hitungTotal()));
        System.out.println("============================");
    }
}
