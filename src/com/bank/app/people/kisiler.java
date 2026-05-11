package com.bank.app.people;



public class kisiler {

    private String ad;
    private String soyad;
    private String tcKimlikNo;
    private String telefon;
//boş constructor
    public kisiler() {
    }
// parametreli constructor oluşturdum.
    public kisiler(String ad, String soyad, String tcKimlikNo, String telefon) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcKimlikNo = tcKimlikNo;
        this.telefon = telefon;
    }
// constructor'a ait getter metotları var
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public String getTelefon() {
        return telefon;
    }
 // constructor'a ait setter metotları var
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }
}

