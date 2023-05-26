import java.util.ArrayList;
import java.util.Scanner;

public class Lomba {
    String namaTim;
    String namaKetua;
    String namaAnggota1;
    String namaAnggota2;
    String katLomba;
    int pilihan;
    int penilaian;
    int index;
    int ID;
    Double nilai = 0.0;
    Algoritma nilaiAlgoritma;
    UIUX nilaUiux;

    Scanner Input = new Scanner(System.in);
    
    public Lomba (String namaTim, String namaKetua, String namaAnggota1, String namaAnggota2, int pilihan, int ID){
        this.namaTim = namaTim;
        this.namaKetua = namaKetua;
        this.namaAnggota1 = namaAnggota1;
        this.namaAnggota2 = namaAnggota2;
        this.ID += ID;
        this.pilihan = pilihan;
        switch (pilihan) {
            case 1:
            this.katLomba = "UI/UX";
            this.ID += 100;
                break;
            case 2:
            this.katLomba = "Algoritma";
            this.ID += 200;
                break;
            case 3:
            this.katLomba = "Data Prosessing";
            this.ID += 300;
                break;
            default:
                break;
        }
    }

    void setIndex(int index) {
        this.index = index;
    }

    int getID() {
        return ID;
    }

    int getIndex() {
        return index;
    }

    String getNamaTim(){
        return namaTim;
    }

    String getNamaKetua(){
        return namaKetua;
    }
    
    String getNamaAnggota1(){
        return namaAnggota1;
    }
    
    String getNamaAnggota2(){
        return namaAnggota2;
    }

    String getKatLomba(){
        return katLomba;
    }

    void setPenilaian(){
        Double nilaiA;
        Double nilaiB;
        Double nilaiC;
        Double nilaiD;
        if (pilihan == 1){
        System.out.println("Inputkan Nilai : ");
        do{
        System.out.println("A. Penjelasan Latar Belakang dan Target Produk = ");
        nilaiA = Input.nextDouble();
        }while(nilaiA < 0.0 || nilaiA > 100);
    
        do{
        System.out.println("B. Skenario Penggunaan = ");
        nilaiB = Input.nextDouble();
        }while(nilaiB < 0.0 || nilaiB > 100);

        do{
        System.out.println("C. Desain = ");
        nilaiC = Input.nextDouble();
        }while(nilaiC < 0.0 || nilaiC > 100);
        
        do{
        System.out.println("D. Konsistensi = ");
        nilaiD = Input.nextDouble();
        }while(nilaiD < 0.0 || nilaiD > 100);

        do{
        nilaUiux = new UIUX(nilaiA, nilaiB, nilaiC, nilaiD);
        nilai = nilaUiux.getAvgNilai();
        }while(nilaiA < 0.0 || nilaiA > 100);
        }else{
            System.out.println("Inputkan Nilai : ");
            do{
            System.out.println("A. Ketepatan Hasil = ");
            nilaiA = Input.nextDouble();
            }while(nilaiA < 0.0 || nilaiA > 100);

            do{
            System.out.println("B. Waktu Eksekusi = ");
            nilaiB = Input.nextDouble();
            }while(nilaiB < 0.0 || nilaiB > 100);

            do{
            System.out.println("C. Pemanfaatan Resource = ");
            nilaiC = Input.nextDouble();
            }while(nilaiC < 0.0 || nilaiC > 100);

            nilaiAlgoritma = new Algoritma(nilaiA, nilaiB, nilaiC);
            nilai = nilaiAlgoritma.getAvgNilai();
        }       
    }

    double getPenilaian(){
        return nilai;
    }

    void showNilai(){
        if(pilihan == 1){
       nilaUiux.showNilai();
        }else{
            nilaiAlgoritma.showNilai();
        }
    }

}
