public class PerpustakaanApp {
    public static void main(String[] args) {
        Koleksi klk = new Koleksi("9839848937", "Joko Tingkir","Wahyu Wincoko", "10/12/2019" , 1, 0);
        klk.getStatus();
        klk.viewData();

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        Buku bku = new Buku("a","b","C","c","d", "e");
        bku.viewData();

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        Majalah mjl = new Majalah("9839848937", "Joko Tingkir","Wahyu Wincoko", "10/12/2019" , 2, 0, "923847");
        mjl.getEdisi();

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        Koran krn = new Koran(" "," "," "," ",3,1);
        krn.viewData();

        System.out.println();
        System.out.println("========================================");
        System.out.println();

        CakramDigital cd = new CakramDigital(null, null, null, null, 0, 0, 2);
        System.out.println("Jenis Media : " +  cd.getJenisMedia());
;    }
}
