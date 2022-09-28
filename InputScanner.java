import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        String Nik, Nama, TmpLahir, TglLahir, Alamat;
        int Usia;
        String JenisKelamin;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Masukkan NIK : ");
            Nik = in.nextLine();
            System.out.println("Masukkan Nama : ");
            Nama = in.nextLine();
            System.out.println("Masukkan Tempat Lahir : ");
            TmpLahir = in.nextLine();
            System.out.println("Masukkan Tanggal Lahir : ");
            TglLahir = in.nextLine();
            System.out.println("Masukkan Alamat : ");
            Alamat = in.nextLine();
            System.out.println("Masukkan Jenis Kelamin L/P : ");
            JenisKelamin = in.nextLine();
            System.out.println("Masukkan Usia : ");
            Usia = in.nextInt();
        }
        System.out.println("Identitas Pribadi Kami");
        System.out.println("----------------------");
        System.out.println("NIK : " + Nik);
        System.out.println("Nama : " + Nama);
        System.out.println("Tempat, Tanggal Lahir : " + TmpLahir + ", " + TglLahir);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Umur : " + Usia);
        System.out.println("Jenis Kelamin : " + JenisKelamin);
    }
}