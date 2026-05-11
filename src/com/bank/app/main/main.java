package com.bank.app.main;
import com.bank.app.accounts.Hesap;
import com.bank.app.accounts.vadesizHesap;
import com.bank.app.cards.krediKarti;
import com.bank.app.people.bankaPersoneli;
import com.bank.app.people.musteriler;
import com.bank.app.service.bankaService;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        bankaService service = new bankaService();
        service.sistemBaslat();

        System.out.println("\n================ BANKA SİSTEMİ ================\n");

//müşterileri oluşturma
        System.out.println(" MÜŞTERİ OLUŞTURMA");

        System.out.println("\nMüşteri 1 bilgileri:");
        System.out.print("Ad: ");
        String ad1 = scanner.nextLine();

        System.out.print("Soyad: ");
        String soyad1 = scanner.nextLine();

        System.out.print("TC: ");
        String tc1 = scanner.nextLine();

        System.out.print("Telefon: ");
        String tel1 = scanner.nextLine();

        musteriler m1 = new musteriler(ad1, soyad1, tc1, tel1);
        System.out.println("Müşteri 1 oluşturuldu.\n");

        System.out.println("Müşteri 2 bilgileri:");
        System.out.print("Ad: ");
        String ad2 = scanner.nextLine();

        System.out.print("Soyad: ");
        String soyad2 = scanner.nextLine();

        System.out.print("TC: ");
        String tc2 = scanner.nextLine();

        System.out.print("Telefon: ");
        String tel2 = scanner.nextLine();

        musteriler m2 = new musteriler(ad2, soyad2, tc2, tel2);
        System.out.println("Müşteri 2 oluşturuldu.\n");

        // banka personelinin bilgileri
        System.out.println(" BANKA PERSONELİ");

        System.out.print("Personel Ad: ");
        String pad = scanner.nextLine();

        System.out.print("Personel Soyad: ");
        String psoyad = scanner.nextLine();

        System.out.print("TC: ");
        String ptc = scanner.nextLine();

        System.out.print("Telefon: ");
        String ptel = scanner.nextLine();

        bankaPersoneli p = new bankaPersoneli(pad, psoyad, ptc, ptel);

        p.musteriEkle(m1);
        p.musteriEkle(m2);

        System.out.println("Müşteriler eklendi.\n");

        //banka hesabı açma 
        System.out.println(" HESAP AÇMA");

        m1.hesapEkle("vadesiz");// hesap türünü belirtiyorum.
        m2.hesapEkle("vadesiz");

        vadesizHesap h1 = (vadesizHesap) m1.getHesaplar().get(0);
        vadesizHesap h2 = (vadesizHesap) m2.getHesaplar().get(0);

        System.out.println("Hesaplar açıldı.\n");

        //hesaba para aktarma
        System.out.println(" PARA YATIRMA");

        System.out.print("Müşteri 1’e yatırılacak para: ");
        double para = scanner.nextDouble();

        h1.paraEkle(para);

        System.out.println("Bakiye: " + h1.getBakiye() + "\n");

        //müşteri1 den müşteri2ye para transfer işlemi
        System.out.println(" PARA TRANSFERİ");

        System.out.print("Transfer miktarı: ");
        double transfer = scanner.nextDouble();

        h1.paraTransferi(h2, h1, transfer);

        System.out.println("Gönderen: " + h1.getBakiye());
        System.out.println("Alıcı: " + h2.getBakiye() + "\n");

        //kredi kartı oluşturma ve kredi kartına ait borç ödeme işlemleri
        System.out.println(" KREDİ KARTI");

        m1.krediKartiEkle();
        krediKarti kart = m1.getKrediKartlari().get(0);

        System.out.print("Kart borcu gir: ");
        double borc = scanner.nextDouble();

        kart.setGuncelBorc(borc);

        System.out.println("Borç: " + kart.getGuncelBorc() + "\n");

        //buurada borcun ödenip ödenmediğine bakılır. Bakiye yetersizse borç ödenmez
        System.out.println(" BORÇ ÖDEME");

        System.out.print("Ödenecek miktar: ");
        double odeme = scanner.nextDouble();

        h1.krediKartiBorcOdeme(kart, odeme);

        System.out.println("Yeni borç: " + kart.getGuncelBorc() + "\n");

        // var olan hesabı silme işlemi
        System.out.println(" HESAP SİLME");

        System.out.println("Hesap silme deneniyor...");

        m1.hesapSil(h1);

        h1.paraCek(h1.getBakiye());

        m1.hesapSil(h1);

        System.out.println("Hesap silme tamamlandı.\n");

        // sonuç
        System.out.println(" Son durum ");

        System.out.println("Hesap sayısı: " + m1.getHesaplar().size());
        System.out.println("Kart borcu: " + kart.getGuncelBorc());

        System.out.println("\n================ BİTTİ ================");

        
    }
}
		
		
		        
		
	

    

