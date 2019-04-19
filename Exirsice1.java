class Insan{
    public Insan(int par){
        System.out.println("Insan yapilandiricisi : " + par);
    }
}
class ZekiInsan extends Insan{
    public ZekiInsan(int par){
        super(par + 1) ; // Dikkat! Insan class'ında constructor fonk çağrılmaktadır.Ilk satır Yazılamlıdır.
        System.out.println("ZekiInsan yapilandiricisi : " + par);
    }
}
class Hacker extends ZekiInsan{
    public Hacker(int par){
        super(par + 1);
        System.out.println("Hacker yapilandiricisi : " + par);
    }
    public static void main(String[] args){
        Hacker hck = new Hacker(5);
    }
}
/**
 * Her sınıf yapılandırıcsına gelen değeri bir arttırıp ana sınıfının yapılandırıcısına 
 * göndermektedir.Fark edildiği üzere ana sınıfın parametre alan yapılandırıcısını çağırıken
 * super anahtar kelimesi kullandık.  
 */