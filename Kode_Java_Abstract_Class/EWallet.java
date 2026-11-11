public class EWallet extends MetodePembayaran {
    private String namaEwallet;
    private String nomorHp;

    public EWallet(String idTransaksi, String namaPelanggan, double jumlah,
                   String namaEwallet, String nomorHp) {
        super(idTransaksi, namaPelanggan, jumlah);
        this.namaEwallet = namaEwallet;
        this.nomorHp = nomorHp;
    }

    @Override
    public double hitungBiayaAdmin() {
        return jumlah * 0.01; // 1% dari jumlah
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Mengirim permintaan pembayaran ke " + namaEwallet + " (" + nomorHp + ")");
        System.out.println("Pelanggan mengonfirmasi dengan PIN.");
        System.out.println("Pembayaran via E-Wallet berhasil.");
    }
}
