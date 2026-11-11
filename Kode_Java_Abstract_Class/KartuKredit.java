public class KartuKredit extends MetodePembayaran {
    private String nomorKartu;
    private int cicilan;

    public KartuKredit(String idTransaksi, String namaPelanggan, double jumlah,
                       String nomorKartu, int cicilan) {
        super(idTransaksi, namaPelanggan, jumlah);
        this.nomorKartu = nomorKartu;
        this.cicilan = cicilan;
    }

    @Override
    public double hitungBiayaAdmin() {
        return jumlah * 0.025; // 2,5% dari jumlah
    }

    @Override
    public void prosesPembayaran() {
        String masked = "**** **** **** " + nomorKartu.substring(nomorKartu.length() - 4);
        System.out.println("Memvalidasi kartu " + masked);
        System.out.println("Cicilan: " + cicilan + "x, tiap bulan Rp"
                + String.format("%,.0f", hitungTotal() / cicilan));
        System.out.println("Pembayaran via Kartu Kredit berhasil.");
    }
}
