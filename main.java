    class Mahasiswa {
        String nama;
        String NPM;
        String jurusan;
        double IPK;
    }

public class main{
    public static void main(String[] args) {
        Mahasiswa Mahasiswa1 = new Mahasiswa();
        Mahasiswa1.nama = "megatiwa";
        Mahasiswa1.NPM = "7658001";
        Mahasiswa1.jurusan = "Teknik Informatika";
        Mahasiswa1.IPK = 3.5;
        
        System.out.println(Mahasiswa1.nama);
        System.out.println(Mahasiswa1.NPM);
        System.out.println(Mahasiswa1.jurusan);
        System.out.println(Mahasiswa1.IPK);
        System.out.println("");
        System.out.println("");

        Mahasiswa Mahasiswa2 = new Mahasiswa();
        Mahasiswa2.nama = "Ucup";
        Mahasiswa2.NPM = "7658002";
        Mahasiswa2.jurusan = "Teknik Informatika";
        Mahasiswa2.IPK = 3.8;
       
        System.out.println(Mahasiswa2.nama);
        System.out.println(Mahasiswa2.NPM);
        System.out.println(Mahasiswa2.jurusan);
        System.out.println(Mahasiswa2.IPK);
    }
}