package com.bank.app.people;
import com.bank.app.accounts.Hesap;
import com.bank.app.accounts.vadesizHesap;//burada üç importta diğer packagelara ait classlarda ki metotlar kullanılır
import com.bank.app.accounts.yatirimHesabi;
import com.bank.app.cards.krediKarti;

import java.util.ArrayList;
import java.util.Random;
public class musteriler extends kisiler {
	private int musteriNumarasi;

    private ArrayList<Hesap> hesaplar;
    private ArrayList<krediKarti> krediKartlari;

    public musteriler(String ad,String soyad, String tcKimlikNo, String telefon) {

        super(ad, soyad, tcKimlikNo, telefon);

        this.musteriNumarasi = musteriNoUret();

        hesaplar = new ArrayList<>();
        krediKartlari = new ArrayList<>();
    }
    private int musteriNoUret() {// bu bir müşteri numarası üreten metottur.10000 ila 99999 arasında sayı üretir

        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }
    public void hesapEkle(String hesapTuru) {//burada hesap türüne bağlı olarak istenen hesabı oluşturur.

        if (hesapTuru.equalsIgnoreCase("vadesiz")) {

            vadesizHesap hesap = new vadesizHesap();
            hesaplar.add(hesap);

            System.out.println("Vadesiz hesap oluşturuldu.");

        } 
        else if (hesapTuru.equalsIgnoreCase("yatirim")) {

            yatirimHesabi hesap = new yatirimHesabi();
            hesaplar.add(hesap);

            System.out.println("Yatırım hesabı oluşturuldu.");
        }
    }
    public void krediKartiEkle() {// kredi karti oluşturan metot

        krediKarti kart = new krediKarti();

        krediKartlari.add(kart);

        System.out.println("Kredi kartı oluşturuldu.");
    }
    public void hesapSil(Hesap hesap) {//bu metotda oluşturulan hesap silinir

        if (hesap.getBakiye() > 0) {

            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");

        } else {

            hesaplar.remove(hesap);
            System.out.println("Hesap silindi.");
        }
    }
    public void krediKartiSil(krediKarti kart) {//burda ki metotda kredi karti silinir.gerçek hayat için iptal olmak kartin iptal olması gibi.
        if (kart.getGuncelBorc() == 0) {
            krediKartlari.remove(kart);
            System.out.println("Kredi kartı silindi.");

        } else {
            System.out.println("Lütfen öncelikle borç ödemesi yapınız.");
        }
    }
    // getter metotları
    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }


    public ArrayList<Hesap> getHesaplar() {
        return hesaplar;
    }

    
    public ArrayList<krediKarti> getKrediKartlari() {
        return krediKartlari;
    }
    // setter metotları
    public void setKrediKartlari(ArrayList<krediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }
    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }
    public void setHesaplar(ArrayList<Hesap> hesaplar) {
        this.hesaplar = hesaplar;
    }
}



    
