
class Mahasiswa {
    String NIM, nama, programStudi, alamat, tanggalLahir;

    public Mahasiswa(String NIM, String nama, String programStudi, String alamat, String tanggalLahir) {
        this.NIM = NIM;
        this.nama = nama;
        this.programStudi = programStudi;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNIM() {
        return NIM;
    }
}

