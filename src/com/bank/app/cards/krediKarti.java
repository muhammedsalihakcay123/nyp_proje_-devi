package com.bank.app.cards;

import java.util.Random;

public class krediKarti {

    private String kartNumarasi;
    private double limit;
    private double guncelBorc;

    public krediKarti() {
        this.kartNumarasi = kartNoUret();
        this.limit = 50000;
        this.guncelBorc = 0;
    }

    private String kartNoUret() {//kart numarasını randomla rastgele üretir
        Random random = new Random();
        return "5400" +
                (1000 + random.nextInt(9000)) +
                (1000 + random.nextInt(9000));
    }
// kredi kartını constructor getter metotları
    public String getKartNumarasi() {
        return kartNumarasi;
    }


    public double getLimit() {
        return limit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }
 // kredi kartını constructor setter metotları
    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }
    public void setKartNumarasi(String kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }
}