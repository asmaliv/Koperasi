class koperasi {
 
    String nama;
    String notlp;
    String alamat;
 
    int saldo, pinjam;
    
    double pajak;
    //method non void
 
    koperasi (String nama, String notlp, String alamat){
        this.nama = nama;
        this.notlp = notlp;
        this.alamat = alamat;
    }
 
    koperasi (int saldo, int pinjam, double pajak){
        this.saldo = saldo;
        this.pinjam = pinjam;
        this.pajak = pajak;
    }
    
 
    double hitung (){
        return (saldo + (pinjam * pajak));
    }
 
    //Method Void
 
    void tampil (){
        System.out.println (this.nama+" | " +this.notlp+" | "+this.alamat);
        System.out.println ();
    }
 
    void ambilSaldo (){
        System.out.println ("Saldo anda : "+ saldo);
        System.out.println ("Anda mengambil sebesar : "+this.pinjam);
        System.out.println ("Sisa saldo anda sebesar : " + this.hitung());
    }
}
 
public class output {
    public static void main ( String [] args){
        koperasi anggota = new koperasi ("ID-01","Jafar","RK-007");
        koperasi pinjam = new koperasi (7000,1000);
        anggota.tampil();
        pinjam.ambilSaldo();
    }
}
