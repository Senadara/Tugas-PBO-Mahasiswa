import java.util.Date;

public class Buku {
    private String pengarang;
    private String tahunMasuk;
    private String issn;
    private String isbn;
    private String doi;
    private String arxivid;

    Buku(String pengarang, String tahunMasuk, String issn, String isbn, String doi, String arxivid){
        this.pengarang = pengarang;
        this.tahunMasuk = tahunMasuk;
        this.issn = issn;
        this.isbn = isbn;
        this.doi = doi;
        this.arxivid = arxivid;

    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public void setTahunMasuk(String tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    public void setIssn(String issn){
        this.issn = issn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setdoi(String doi){
        this.doi = doi;
    }

    public void setArxivid(String arxivid){
        this.arxivid = arxivid;
    }

    public void viewData(){
        System.out.println("Pengarang   : " + this.pengarang);
        System.out.println("Tahun Masuk : " + this.tahunMasuk);
        System.out.println("ISSN        : " + this.issn);
        System.out.println("ISBN        : " + this.isbn);
        System.out.println("DOI         : " + this.doi);
        System.out.println("ARXIVID     : " + this.arxivid);
    }

    public String getPengarang(){
        return pengarang;
    }

    public String getTahunMasuk(){
        return tahunMasuk;
    }

    public String getIssn(){
        return issn;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getDoi(){
        return doi;
    }

    public String getArxivid(){
        return arxivid;
    }
}
