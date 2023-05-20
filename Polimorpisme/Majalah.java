public class Majalah extends Koleksi {
    private String edisi;


    Majalah(String idKoleksi, String nama, String penerbit, String tanggalTerbit, int jenis, int status, String edisi){
        super(idKoleksi, nama, penerbit, tanggalTerbit, jenis, status);
        this.edisi = edisi;
    }

    public void getEdisi(){
        System.out.println("Edisi buku : " + edisi);
    }


}
