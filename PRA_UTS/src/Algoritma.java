public class Algoritma {
    protected double nilaiA;
    protected double nilaiB;
    protected double nilaiC;

    Algoritma (double nilaiA, double nilaiB, double nilaiC){
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }

    void showNilai(){
        System.out.println("Nilai Ketepatan Hasil = " + nilaiA);
        System.out.println("Nilai Waktu Eksekusi = " + nilaiB);
        System.out.println("Nilai Pemanfaatan Resource = " + nilaiC);
    }

    double getAvgNilai(){
        System.out.println(nilaiA + nilaiB + nilaiC);
        return (nilaiA + nilaiB + nilaiC)/3;
    }

}
