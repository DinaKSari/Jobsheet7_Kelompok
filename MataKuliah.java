public class MataKuliah{
    String kodeMK;
    String namaMK;
    int sks;

    //konstruktor berparameter
    MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    //konstruktor default
    MataKuliah(){

    }

    void tampilMataKuliah(){
        System.out.println("Kode MK: " + kodeMK + " | Nama: " + namaMK + " | SKS: " + sks);
    }

}