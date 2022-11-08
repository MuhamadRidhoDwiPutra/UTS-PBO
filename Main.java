public class Main {
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        dsn.setJurusan("Pemograman Mobile");
        dsn.setNidn(24112002);
        dsn.setNama("Ika Arfiani, S.T., M.Cs.");
        dsn.setNip(978635421);
        dsn.setTglLahir("03-03-1995");
        dsn.setJk("Perempuan");
        dsn.setAlamat("Bandung");
        dsn.setTahunMasuk(2018);

        Tendik tndk = new Tendik();
        tndk.setNama("Adi");
        tndk.setNip(87654321);
        tndk.setTglLahir("21-10-1991");
        tndk.setAlamat("Riau");
        tndk.setJk("Laki-Laki");
        tndk.setTahunMasuk(2019);

        System.out.println("Nama Dosen          : "+ dsn.getNama());
        System.out.println("NIDN                : " +dsn.getNidn());
        System.out.println("NIP  Dosen          : "+ dsn.getNip());
        System.out.println("Jurusan             : " + dsn.getJurusan());
        System.out.println("Tanggal Lahir       : "+ dsn.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ dsn.getJk());
        System.out.println("Alamat              : "+ dsn.getAlamat());
        System.out.println("Tahun masuk         : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ dsn.gajiTotal());
        System.out.println("Kelas lebih (3 SKS) : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji total          : "+ dsn.gajiTotal(6));
        System.out.println("\n");
        System.out.println("Nama Tendik         : "+ tndk.getNama());
        System.out.println("NIP  Tendik         : "+ tndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tndk.getJk());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tndk.getTahunMasuk());
        System.out.println("Upah lembur(20 jam) : "+ tndk.lembur(20));
        System.out.println("Gaji pokok          : "+tndk.gajiTotal());
        System.out.println("Gaji total          : "+ tndk.gajiTotal(20));
    }
}