package com.bank.app.accounts;

public class yatirimHesabi extends Hesap {

    public yatirimHesabi() {
        super();
    }
// yatırım hesabını para çekme ve yatırma metotları
    
    public void paraEkle(double miktar) {
        bakiye += miktar;
        System.out.println("Yatırım hesabına " + miktar + " TL yatırıldı.");
    }

    
    public void paraCek(double miktar) {

        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } else {
            bakiye -= miktar;
            System.out.println("Yatırım hesabından " + miktar + " TL çekildi.");
        }
    }
}