public class VideoPromosi extends Video implements DapatDipromosikan {
    public VideoPromosi(String id, String namaFile, double ukuranMB, int durasiMenit) {
        super(id, namaFile, ukuranMB, durasiMenit);
    }

    @Override
    public void promosikan() {
        System.out.println(">> Aset video \"" + namaFile + "\" berhasil dipromosikan ke halaman utama!");
    }
}