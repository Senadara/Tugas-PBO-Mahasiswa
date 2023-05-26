public class Peserta{
    private String nama;
    private String katLomba;

    Peserta(String nama, int pilihan){
        this.nama = nama;
        switch (pilihan) {
            case 1:
            this.katLomba = "UI/UX";
                break;
            case 2:
            this.katLomba = "Algoritma";
                break;
            case 3:
            this.katLomba = "Data Prosessing";
                break;
            default:
                break;
        }
    }

    public String getNama() {
        return nama;
    }

    public String getKatLomba() {
        return katLomba;
    }
}
