/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungvolumebalok;

/**
 *
 * @author dwiksanti(2201010595)
 * TGL: 26-06-24
 */
public class HitungVolumeBalok {
    private double Pj;
    private double Lb;
    private double Tg;

    public HitungVolumeBalok() {
        this.Pj = 0;
        this.Lb = 0;
        this.Tg = 0;
    }
    public HitungVolumeBalok(double Pj, double Lb, double Tg) {
        this.Pj = Pj;
        this.Lb = Lb;
        this.Tg = Tg;
    }
    public void setPj(double npj) {
        this.Pj = npj;
    }
    public void setLb(double nlb) {
        this.Lb = nlb;
    }
    public void setTg(double ntg) {
        this.Tg = ntg;
    }
    public double getVolume() {
        return this.Pj * this.Lb * this.Tg;
    }
    public void printHasil() {
        System.out.println("Volume balok adalah: " + getVolume());
    }
    
    public void printDimensions() {
        System.out.println("Dimensi balok:");
        System.out.println("Panjang: " + this.Pj);
        System.out.println("Lebar: " + this.Lb);
        System.out.println("Tinggi: " + this.Tg);
    }
    public void setDimensions(double npj, double nlb, double ntg) {
        setPj(npj);
        setLb(nlb);
        setTg(ntg);
    }
    public static void main(String[] args) {
        HitungVolumeBalok balok1 = new HitungVolumeBalok();
        balok1.setPj(5);
        balok1.setLb(3);
        balok1.setTg(2);
        balok1.printDimensions();
        balok1.printHasil();
        HitungVolumeBalok balok2 = new HitungVolumeBalok(10, 4, 3);
        balok2.printDimensions();
        balok2.printHasil();
    }
}
