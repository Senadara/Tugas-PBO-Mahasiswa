import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Koleksi {
    public String idKoleksi;
    public String nama;
    public String penerbit;
    public String tanggalTerbit;
    public String jenis;
    public String status;
    public int jumStock;

    public Koleksi(String idKoleksi, String nama, String penerbit, String tanggalTerbit, int jenis, int status){
        this.idKoleksi = idKoleksi;
        this.nama = nama;
        this.penerbit = penerbit;
        this.tanggalTerbit = tanggalTerbit;

        switch(jenis){
            case 1:
            this.jenis = "Buku";
            break;
            case 2:
            this.jenis = "Majalah";
            break;
            case 3:
            this.jenis = "Koran";
            break;
            case 4:
            this.jenis = "Cakram Digital";
            break;
            default:
            this.jenis = "Pilihan Tidak Terdefinisi";
            break;
        }

        setStatus(status);
    }

    public void setStatus(int status){

        if (status > 0){
            this.status = "Available";
        }else{
            this.status = "Unavailable";
        }

        this.jumStock = status;

    }

    public String getIdKoleksi(){
        return idKoleksi;
    }

    public String getNama(){
        return nama;
    }

    public String getPenerbit(){
        return penerbit;
    }

    public String getTanggalTerbit(){
        return tanggalTerbit;
    }

    public String getJenis(){
        return jenis;
    }

    public String getStatus(){
        return status;
    }

    public void viewData(){
        System.out.println("ID Koleksi     : " + this.idKoleksi);
        System.out.println("Nama           : " + this.nama);
        System.out.println("Penerbit       : " + this.penerbit);
        System.out.println("Tanggal Terbit : " + this.tanggalTerbit);
        System.out.println("Jenis          : " + this.jenis);
        System.out.println("Status         : " + this.status + " | " + this.jumStock + " book");
    }


}
