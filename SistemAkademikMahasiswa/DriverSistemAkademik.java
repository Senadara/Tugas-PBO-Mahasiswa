import java.util.ArrayList;
import java.util.Scanner;

class DriverSistemAkademik {
    ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
    Scanner input = new Scanner(System.in);

    public void tambahMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String NIM = input.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan program studi: ");
        String programStudi = input.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan tanggal lahir: ");
        String tanggalLahir = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(NIM, nama, programStudi, alamat, tanggalLahir);
        daftarMahasiswa.add(mhs);

        System.out.println("Mahasiswa dengan NIM " + NIM + " telah ditambahkan.");
    }

    public void cariMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yang dicari: ");
        String NIM = input.nextLine();

        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNIM().equals(NIM)) {
                System.out.println("Data Mahasiswa:");
                System.out.println("NIM: " + mhs.NIM);
                System.out.println("Nama: " + mhs.nama);
                System.out.println("Program Studi: " + mhs.programStudi);
                System.out.println("Alamat: " + mhs.alamat);
                System.out.println("Tanggal Lahir: " + mhs.tanggalLahir);
                return;
            }
        }

        System.out.println("Mahasiswa dengan NIM " + NIM + " tidak ditemukan.");
    }
}