public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    Mahasiswa dataMahasiswa[] = new Mahasiswa[5];
    int idx;

    //KONSTRUKTOR BERPARAMETER
    Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    //KONSTRUKTOR DEFAULT
    Mahasiswa(){
    }

    void tampilMahasiswa(){
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi " + prodi);
    }

    void tambah(Mahasiswa mhs) {
        if (idx < dataMahasiswa.length) {
            dataMahasiswa[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data mahasiswa sudah penuh!");
        }
    }

    void tampilMhs(){
        for (int i = 0; i < idx; i++) { 
            if (dataMahasiswa[i] != null) {
                dataMahasiswa[i].tampilMhs();
            }
        }
    }
}