// Absstract Exirsice
/**
 * Ana fikir şöyledir: Eğer bir işlem değişik verilere ihtiyac duyup aynı işi yapıyorsa 
 * bu işlem soyut (abstract) sınıfın içersinde tanımlanmalıdır.
 */
abstract class Cizim{
    //abstract method
    public abstract void nokatCiz(int x, int y);
    //Not abstract method
    public void cizgiCiz(int x1, int y1, int x2, int y2){
        nokatCiz(4 , 7);
    }
}
class CepTelefonuCizim extends Cizim{
    public void nokatCiz(int x, int y){
        System.out.println("Cep telefonu ekrani için nokta ciz");
    }
}
class MonitorCizim extends Cizim{
    public void nokatCiz(int x, int y){
        System.out.println("Monitor ekrani için nokta ciz");
    }
}
public class CizimProgrami{
    public static void baslat(int x1, int y1, int x2, int y2){
        Cizim c1 = new CepTelefonuCizim();
        c1.cizgiCiz(5, 7, 8, 9);
        Cizim c2 = new MonitorCizim();
        c2.cizgiCiz(4, 5, 1, 3);
    }
    public static void main(String[] args){
        baslat(4 , 7, 8, 9);
    }
}
