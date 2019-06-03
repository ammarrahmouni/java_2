//Abstract Exirsice
//ilginiç bir yapilanırıcı örneği

abstract class Sporcu{
    public abstract void calis();
    //Constructor mtot
    public Sporcu(){
        System.out.println("calis() cagirlmadan evvel");
        calis(); //Dikkat!
        System.out.println("calis() cagirildikten sonra");
    }
}
class Futbolcu extends Sporcu{
    int antraman_sayisi = 4;
    @Override
    public void calis(){
        System.out.println("Futbolcu calis() " + antraman_sayisi);
    }
    //Constructor mtot
    public Futbolcu(){
        super(); //Bunu yazmaya biliriz
        System.out.println("Futbolcu Yapilandirici");
        calis();
    }
}
public class Spor{
    public static void main(String[] args){
        Futbolcu f = new Futbolcu();
    }
    
    //Sporcu s = new Sporcu(); //Hata Soyut sınıf
}