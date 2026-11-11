public class TransferBank extends MetodePembayaran {
    private String namaBank;
    private String nomorRekening;

    public TransferBank(String idTransaksi, String namaPelanggan, double jumlah,
                        String namaBank, String nomorRekening) {
        super(idTransaksi, namaPelanggan, jumlah);
        this.namaBank = namaBank;
        this.nomorRekening = nomorRekening;
    }

    @Override
    public double hitungBiayaAdmin() {
        return 2500; // biaya tetap
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses transfer ke rekening " + namaBank + " " + nomorRekening);
        System.out.println("Menunggu konfirmasi transfer dari bank...");
        System.out.println("Pembayaran via Transfer Bank berhasil.");
    }
}
