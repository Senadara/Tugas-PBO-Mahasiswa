public class UIUX extends Algoritma {

    private double nilaiD;
    UIUX (double nilaiA, double nilaiB, double nilaiC, double nilaiD){
        super(nilaiA, nilaiB, nilaiC);
        this.nilaiD = nilaiD;
    }

    public double getNilaiD() {
        return nilaiD;
    }

    @Override
    void showNilai(){
        System.out.println("Penjelasan latar belakang dan target produk = " + nilaiA);
        System.out.println("Skenario penggunaan = " + nilaiB);
        System.out.println("Desain = " + nilaiC);
        System.out.println("Konsistensi = " + nilaiD);
    }

    @Override
    double getAvgNilai(){
        //System.out.println(nilaiA + nilaiB + nilaiC + nilaiD);
        return (nilaiA + nilaiB + nilaiC + nilaiD)/4;
    }
}
