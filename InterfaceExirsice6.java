 interface Calisan{
    double calisanSabiti = 0.7;
    void bolumYazdir();
    void ucretBelirle(double ucret);
    double ucret();
}
interface PazarlamaKom extends Calisan{
    final double komSabit = 0.2;
    public void komBelirle(int adet);
}
class Pazarlamaci implements PazarlamaKom{
    double ucret;
    double komsiyon;
    public void bolumYazdir(){
        System.out.println("--------Pazarlama----------");
    }
    public void ucretBelirle(double ucret){
        this.ucret = ucret;
    }
    public void komBelirle(int adet){
        System.out.println("Satilan urun adedi : " + adet);
        komsiyon = komSabit * adet;
    }
    public double ucret(){
        return (ucret * calisanSabiti) + komsiyon;
    }
}
class Isci implements Calisan{
    double ucret;
    public void bolumYazdir(){
        System.out.println("---------isci----------");
    }
    public void ucretBelirle(double ucret){
        this.ucret = ucret;
    }
    public double ucret(){
        return ucret * calisanSabiti;
    }
}
class Yonetici implements Calisan{
    double ucret;
    public void bolumYazdir(){
        System.out.println("---------Yonetici----------");
    }
    public void ucretBelirle(double ucret){
        this.ucret = ucret;
    }
    public double ucret(){
        return ucret;
    }
}
public class InterfaceExirsice6{
    public static void main(String[] args){
        Isci i = new Isci();
        i.bolumYazdir();
        i.ucretBelirle(912.23);
        System.out.println("Ucret = " + i.ucret());
        System.out.println("-------------");

        Yonetici y = new Yonetici();
        y.bolumYazdir();
        y.ucretBelirle(1078.28);
        System.out.println("Ucret = " + y.ucret());
        System.out.println("-------------");

        Pazarlamaci p = new Pazarlamaci();
        p.bolumYazdir();
        p.ucretBelirle(976.45);
        p.komBelirle(50);
        System.out.println("Komsyion : " + p.komsiyon);
        System.out.println("Ucret = " + p.ucret());
        System.out.println("-------------");
    }
}