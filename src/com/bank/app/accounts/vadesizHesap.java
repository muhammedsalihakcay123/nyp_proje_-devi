package com.bank.app.accounts;
import com.bank.app.cards.krediKarti;

public class vadesizHesap extends Hesap {// hesap sınıfından miras alır

    public vadesizHesap() {
        super();
    }

    public void paraTransferi(vadesizHesap aliciHesap,vadesizHesap gonderenHesap,double miktar) {// müşterieler arasında para transferi sağlar. Gönderen  hesabın bakiyesi kontrol edilerek transfer gerçekleşir 
        if (gonderenHesap.bakiye >= miktar) {
            gonderenHesap.bakiye -= miktar;
            aliciHesap.bakiye += miktar;

            System.out.println("Transfer başarılı.");
        } 
        else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public void borcOdeme(krediKarti kart,double miktar) {//kredi kart borçunu ödemek için kullanılan metottur. en sonda borçun ödenip ödenmediğini yazar
            if (bakiye >= miktar) {

            bakiye -= miktar;
            kart.setGuncelBorc(kart.getGuncelBorc() - miktar);

            System.out.println("Kredi kartı borcu ödendi.");

        } 
           else {
            System.out.println("Yetersiz bakiye!");
        }
    }

	public void krediKartiBorcOdeme(krediKarti kart, double odeme) {
		// TODO Auto-generated method stub
		
	}
}


