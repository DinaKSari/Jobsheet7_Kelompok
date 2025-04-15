public class DataMahasiswa {
    Mahasiswa[] dataMahasiswa = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa mhs) {
        if (idx < dataMahasiswa.length) {
            dataMahasiswa[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data mahasiswa sudah penuh!");
        }
    }

    void tampilMhs() {
        if (idx == 0) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataMahasiswa[i].tampilMahasiswa();
            }
        }
    }

    Mahasiswa cariByNim(String nim) {
        for (int i = 0; i < idx; i++) {
            if (dataMahasiswa[i].nim.equals(nim)) {
                return dataMahasiswa[i];
            }
        }
        return null;
    }
}
