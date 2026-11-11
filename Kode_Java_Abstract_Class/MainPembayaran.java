public class MainPembayaran {
    public static void main(String[] args) {
        // MetodePembayaran m = new MetodePembayaran(...); // ERROR: abstract class tidak dapat diinstansiasi

        MetodePembayaran p1 = new TransferBank("TRX001", "Budi", 500000, "BCA", "1234567890");
        MetodePembayaran p2 = new EWallet("TRX002", "Siti", 250000, "GoPay", "081234567890");
        MetodePembayaran p3 = new KartuKredit("TRX003", "Andi", 1200000, "4111111111111234", 3);

        MetodePembayaran[] daftar = {p1, p2, p3};
        int no = 1;
        for (MetodePembayaran p : daftar) {
            System.out.println("\n--- Transaksi " + no++ + " (" + p.getClass().getSimpleName() + ") ---");
            p.prosesPembayaran();
            p.cetakStruk();
        }
    }
}
