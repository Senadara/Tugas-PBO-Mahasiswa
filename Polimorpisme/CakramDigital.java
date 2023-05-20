public class CakramDigital extends Koleksi{
    private int jenisMedia;

    public CakramDigital(String idKoleksi, String nama, String penerbit, String tanggalTerbit, int jenis, int status, int jenisMedia){
        super(idKoleksi, nama, penerbit, tanggalTerbit, jenis, status);
        
        this.jenisMedia = jenisMedia;
    }

    public String getJenisMedia(){
        switch(jenisMedia){
            case 1 :
            return "Visual";

            case 2 :
            return "Audio";

            case 3 :
            return "Visual Audio";

            default :
            return "Jenis Tidak Terdefinisi";

        }

    }
}