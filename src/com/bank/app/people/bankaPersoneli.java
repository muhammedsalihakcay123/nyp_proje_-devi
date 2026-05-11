package com.bank.app.people;
import java.util.ArrayList;
import java.util.Random;
public class bankaPersoneli extends kisiler {//kisiler classında miras alır

    private int personelID;

    private ArrayList<musteriler> musteriler;

    public bankaPersoneli(String ad, String soyad, String tcKimlikNo,String telefon) {//banka personelini tutan constructor

        super(ad, soyad, tcKimlikNo, telefon);

        this.personelID = personelIdUret();

        musteriler = new ArrayList<>();
    }

    private int personelIdUret() {//personel ID'sini randomla rastgele üretir

        Random random = new Random();

        return 1000 + random.nextInt(9000);
    }

    public void musteriEkle(musteriler musteri) {

        musteriler.add(musteri);

        System.out.println("Müşteri temsilciye eklendi.");
    }

    public int getPersonelID() {
        return personelID;
    }
    public ArrayList<musteriler> getMusteriler() {
        return musteriler;
    }
    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    

    public void setMusteriler(ArrayList<musteriler> musteriler) {
        this.musteriler = musteriler;
    }
}