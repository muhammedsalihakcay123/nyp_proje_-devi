package com.bank.app.accounts;
import java.util.Random;

public class Hesap { 

    protected String iban;
    protected double bakiye;

    public Hesap() {
        this.iban = ibanUret();
        this.bakiye = 0;
    }

    private String ibanUret() {// müşteriye rastgele bir ıban oluştururrandom yapısı kullanılarak
        Random random = new Random();
        return "TR" + (100000 + random.nextInt(900000));
    }

    public void paraEkle(double miktar) {//bu metotta bakiyeye müşterinin para yatırmasını  sağlar
        bakiye += miktar;
        System.out.println(miktar + " TL hesaba yatırıldı.");
    }

    public void paraCek(double miktar) {//bu metotta bakiyede buluna limit yeterli ise müşterinin para çekmesini sağlar
        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } else {
            bakiye -= miktar;
            System.out.println(miktar + " TL hesaptan çekildi.");
        }
    }
// constructor getter metotları 
    public String getIban() {
        return iban;
    }

   

    public double getBakiye() {
        return bakiye;
    }
 // constructor setter metotları 
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

}


