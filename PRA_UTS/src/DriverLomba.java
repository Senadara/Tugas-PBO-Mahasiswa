import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DriverLomba {
    //Membuat Arraylist untuk menyimpan data peserta
    static ArrayList<Lomba> dtp = new ArrayList<>();
    static List<Peserta> psrt = new ArrayList<>();
    static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
        int process = 1;
        int ID = 0;

        do{
        System.out.println("======ICT COMPETITION======");
        System.out.println("1. Register");
        System.out.println("2. Input Nilai");
        System.out.println("3. Search Tim");
        System.out.println("4. Show all Tim");
        System.out.println("5. Keluar");
        System.out.print("=>> ");
        process = Input.nextInt();

        switch(process){
            case 1 :
            ID ++;
            addPeserta(ID);
            break;
            case 2 :
            addNilai();
            break;
            case 3 :
            searchTim();
            break;
            case 4 :
            showPeserta();
            break;
            case 5 :
            break;
            default :
            System.out.println("There is no option '"+ process +"'");
            break;
        }
    }while(process != 5);
    
    }

    //method untuk registrasi peserta
    static int addPeserta(int ID){
        int n;
        int pilih;
        String nTim;
        String namaKetua;
        String namaAnggota1 = "";
        String namaAnggota2 = "";
        System.out.println("=========REGISTRASI PESERTA===========");
        System.out.println("Pilih Kategori Lomba : ");
        System.out.println("1. UI/UX ");
        System.out.println("2. Algoritma");
        System.out.println("3. Data Prosessing");
        System.out.print("Pilih no : ");
        pilih = Input.nextInt();
        Input.nextLine();
        do{
        n = 0;
        System.out.print("Masukan Nama Timu : ");
        nTim = Input.nextLine();
        for (Lomba Lomba : dtp){
            if (nTim.equalsIgnoreCase(Lomba.namaTim)){
                System.out.println("Nama Tim Sudah Terpakai");
                n = 1;
            }
        }
        }while(n == 1);
        n = 0;
        System.out.print("Nama Ketua        : ");
        namaKetua = Input.nextLine();
        if (isPesertaSudahTerdaftar(psrt, namaKetua)) {
            System.out.println("Peserta " + namaKetua + " sudah terdaftar lomba.");
            return 0;
        }
        Peserta pst1 = new Peserta(namaKetua, pilih);
        

        System.out.print("Nama Anggota 1    : ");
        namaAnggota1 = Input.nextLine();
        if (isPesertaSudahTerdaftar(psrt, namaAnggota1)) {
            System.out.println("Peserta " + namaAnggota1 + " sudah terdaftar lomba.");
            return 0;
        }
        Peserta pst2 = new Peserta(namaAnggota1, pilih);
       

        System.out.print("Nama Anggota 2    : ");
        namaAnggota2 = Input.nextLine();
        if (isPesertaSudahTerdaftar(psrt, namaAnggota2)) {
            System.out.println("Peserta " + namaAnggota2 + " sudah terdaftar lomba.");
            return 0;
        }

        System.out.println("Berhasil Mendaftar");
        Peserta pst3 = new Peserta(namaAnggota2, pilih);
        psrt.add(pst1);
        psrt.add(pst2);
        psrt.add(pst3);

        Lomba dtp1 = new Lomba(nTim, namaKetua, namaAnggota1, namaAnggota2, pilih, ID);
        dtp.add(dtp1);
        System.out.println("ID Team = " + dtp1.getID());
        return 0;
        }

        static boolean isPesertaSudahTerdaftar(List<Peserta> daftarPeserta, String nama) {
            for (Peserta peserta : daftarPeserta) {
                if (peserta.getNama().equalsIgnoreCase(nama)) {
                    return true;
                }
            }
            return false;
        }

    //method untuk menginputkan nilai peserta  
    static void addNilai(){
        ArrayList <Lomba> result = new ArrayList<>();
        int indexPeserta = 0;
        int i=0;

        System.out.println("Cari Tim berdasarkan : ");
        System.out.println("1. ID Team ");
        System.out.println("2. Nama Team ");
        System.out.print("Pilih ==>");
        int opsi = Input.nextInt();
        Input.nextLine();

        if(opsi == 1){
        System.out.print("Masukan ID Team : ");
        int ID = Input.nextInt();
        for (Lomba Lomba : dtp){
            if (Lomba.getID() == ID) {
                Lomba.setIndex(indexPeserta);
                result.add(Lomba);              
            }
            indexPeserta++;        
        }
        }else if(opsi == 2){
        System.out.print("Masukan Nama Team : ");
        String ID = Input.nextLine();
        for (Lomba Lomba : dtp){
            if (Lomba.getNamaTim().toLowerCase().contains(ID.toLowerCase())) {
                Lomba.setIndex(indexPeserta);
                result.add(Lomba);              
            }
            indexPeserta++;        
        }
        }else{
            System.out.println("Index tidak terdefinisi");
            opsi = 0;
        }
        //perulangan untuk mencari nama tim
        
    if (result.size() <= 0){
        System.out.println("Tim dengan id tersebut tidak tersedia");
    }else{
        for(Lomba Lomba : result){
            i++;
            System.out.print(i + ". Nama Tim = ");
            System.out.println(Lomba.getNamaTim());
            System.out.print("Kategori Lomba = ");
            System.out.println(Lomba.getKatLomba());
            System.out.println("<<=====================================");
        }
        System.out.print("Pilih : ");
        int pilihan = Input.nextInt() - 1;
        if(pilihan < 0 || pilihan > result.size() ){
            System.out.println("Indexs Tim tidak valid");
        }else{
            Lomba dataPeserta = result.get(pilihan);
            dataPeserta.setPenilaian();
            int indexArray = dataPeserta.getIndex();
            dtp.set(indexArray, dataPeserta);
        }

    }
}

    static void searchTim(){
        ArrayList <Lomba> result = new ArrayList<>();
        int i=0;
        Input.nextLine();
        System.out.print("Masukan Nama Tim : ");
        String ID = Input.nextLine();

        //perulangan untuk mencari nama tim
        for (Lomba Lomba : dtp){
            if (Lomba.getNamaTim().toLowerCase().contains(ID.toLowerCase())) {
                result.add(Lomba);              
            }     
        }
    if (result.size() <= 0){
        System.out.println("Tim dengan nama tersebut tidak tersedia");
    }else{
        for(Lomba Lomba : result){
            i++;
            System.out.print(i + ". Nama Tim = ");
            System.out.println(Lomba.getNamaTim());
            System.out.print("Kategori Lomba = ");
            System.out.println(Lomba.getKatLomba());
            System.out.println("========================================");  
        }
        System.out.print("Pilih : ");
        int pilihan = Input.nextInt() - 1;
        if(pilihan < 0 || pilihan > result.size() ){
            System.out.println("Indexs Tim tidak valid");
        }else{
        for(Lomba Lomba : result){
            System.out.println("=============| DATA TEAM |==============");
            System.out.println("ID Team = " + Lomba.getID());
            System.out.println("Nama Tim = " + Lomba.getNamaTim());
            System.out.println("Kategori Lomba = " + Lomba.getKatLomba());
            System.out.println("===============| NILAI |================");
            if (Lomba.getPenilaian() == 0.0 ){
                System.out.println("---- Nilai Belum Di inputkan ----");
                }else{
                Lomba.showNilai();
                }
            System.out.println("<<=====================================>>");
        }
    }
}
    }

    //method untuk menampilkan semua peserta
    static void showPeserta(){
        int i = 0;
        for (Lomba Lomba : dtp){
            i++;
            if (Lomba.getPenilaian() == 0.0 ){
            System.out.println(i + ". " + "ID " + Lomba.getID() + " | " + Lomba.getNamaTim()  +" = Nilai Belum Di inputkan");
            }else{
            System.out.println(i + ". " + "ID " + Lomba.getID() + " | " + Lomba.getNamaTim()  +" = "+ Lomba.getPenilaian());
            }
        }
    }
}