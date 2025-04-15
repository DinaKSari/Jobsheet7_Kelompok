public class DataPenilaian {
    Penilaian[] daftarNilai = new Penilaian[10];
    int idx;

    void tambah(Penilaian p) {
        if (idx < daftarNilai.length) {
            daftarNilai[idx] = p;
            idx++;
        } else {
            System.out.println("Data penilaian sudah penuh!");
        }
    }

    void tampilSemua() {
        System.out.println("Data Penilaian:");
        for (int i = 0; i < idx; i++) {
            daftarNilai[i].tampilNilai();
        }
    }

    //memakai bubblesort descending
    void urutkanBerdasarkanNilaiAkhir() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (daftarNilai[j].nilaiAkhir < daftarNilai[j + 1].nilaiAkhir) {
                    Penilaian temp = daftarNilai[j];
                    daftarNilai[j] = daftarNilai[j + 1];
                    daftarNilai[j + 1] = temp;
                }
            }
        }
    
        System.out.println("Data Penilaian (Urut Nilai Akhir - Tertinggi ke Terendah):");
        for (int i = 0; i < idx; i++) {
            daftarNilai[i].tampilNilai();
        }
    }
    
}
