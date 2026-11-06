import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {
        // 1. Membuat ArrayList<AsetDigital> berisi minimal 1 objek dari masing-masing subclass
        ArrayList<AsetDigital> daftarAset = new ArrayList<>();
        daftarAset.add(new Gambar("G001", "pemandangan.jpg", 4.5, "1920x1080"));
        daftarAset.add(new Video("V001", "tutorial_java.mp4", 150.0, 45));
        daftarAset.add(new Dokumen("D001", "laporan_pbo.pdf", 2.1, 20));
        daftarAset.add(new VideoPromosi("VP001", "teaser_promo.mp4", 85.0, 2));

        System.out.println("===== MANAJEMEN ASET DIGITAL (POLIMORFISME ABSTRACT CLASS) =====");
        // 2. Iterasi dan panggil tampilkanPreview() — polimorfisme via abstract class
        for (AsetDigital aset : daftarAset) {
            aset.getInfo();
            aset.tampilkanPreview();
            
            // 3. Gunakan instanceof untuk mengecek objek yang mengimplementasikan DapatDipromosikan
            if (aset instanceof DapatDipromosikan) {
                System.out.println("-- Status Promosi --");
                DapatDipromosikan promo = (DapatDipromosikan) aset;
                promo.promosikan();
                promo.infoPromosi();
            }
            System.out.println("------------------------------------------------");
        }

        // 4. Buat ArrayList<DapatDipromosikan> terpisah dan tambahkan VideoPromosi ke dalamnya
        ArrayList<DapatDipromosikan> daftarPromosi = new ArrayList<>();
        daftarPromosi.add(new VideoPromosi("VP002", "campaign_akhir_tahun.mp4", 120.0, 3));

        System.out.println("\n===== KELOMPOK ASET DIPROMOSIKAN (POLIMORFISME INTERFACE) =====");
        for (DapatDipromosikan dp : daftarPromosi) {
            dp.promosikan();
            dp.infoPromosi();
        }
    }
}