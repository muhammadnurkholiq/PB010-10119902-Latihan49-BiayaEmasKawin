/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan49.biayaemaskawin;

/**
 *
 * @author korik
 */
public class Emas {
    private double beratEmas;
    private double hargaEmas;

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public double getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(double  hargaEmas) {
        this.hargaEmas = hargaEmas;
    }
    
    public double totalBayar(double beratEmas, double hargaEmas){
        double totalBayar;
        return totalBayar = beratEmas * hargaEmas;
    }
}