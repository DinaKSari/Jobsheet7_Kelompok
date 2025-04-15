public class DataMataKuliah {
    MataKuliah[] daftarMK = new MataKuliah[5];
    int idx;

    void tambah(MataKuliah mk) {
        if (idx < daftarMK.length) {
            daftarMK[idx] = mk;
            idx++;
        } else {
            System.out.println("Daftar mata kuliah sudah penuh!");
        }
    }

    void tampilMK() {
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < idx; i++) {
            daftarMK[i].tampilMataKuliah();
        }
    }
}
