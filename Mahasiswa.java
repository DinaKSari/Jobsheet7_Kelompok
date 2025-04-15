public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    Mahasiswa dataMahasiswa[] = new Mahasiswa[5];

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
}