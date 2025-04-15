public class Penilaian {

    Mahasiswa mahasiswa;
    MataKuliah matakuliah;
    DataMataKuliah dataMataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    Penilaian() {
    }

    Penilaian(Mahasiswa mhs, MataKuliah matkul, double tugas, double uts, double uas) {
        this.mahasiswa = mhs;
        this.matakuliah = matkul;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        hitungNilaiAkhir();
    }
    

    void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    void tampilNilai() {
        System.out.println(mahasiswa.nama + " | " + matakuliah.namaMK + " | Nilai Akhir: " + nilaiAkhir);
    }
    
}