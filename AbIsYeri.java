// Abstract Exirsice
abstract class Calisan{
    public String pozisyon = "Calisan";
    public abstract void calis(); //Soyut Yordamlar
    public void zamIste(){ //Soyut olmayan yordamlar
        System.out.println("Calisan zam istiyor.");
    }
}
class Mudur extends Calisan{
    public Mudur(){ // Yapılandırıcı
        pozisyon = "Mudur"; 
    }
    @Override   
    public void calis(){  //Override
        System.out.println("Mudur Calisiyor");
    }
}
class Programci extends Calisan{
    public Programci(){ // Yapılandırıcı
        pozisyon = "Programci";
    }
    @Override
    public void calis(){    //(Override) yapmak zorundayız
        System.out.println("Programci calisiyor");
    }
    @Override
    public void zamIste(){//Override yapmak zorunda değiliz
        System.out.println("Programci zam istiyor");
    }
}
class Pazarlamaci extends Calisan{
    public Pazarlamaci(){   // Yapılandırıcı
        pozisyon = "Pazarlamaci";
    }
    @Override
    public void calis(){    //(Override)
        System.out.println("Pazarlamaci calisyior");
    }
}
public class AbIsYeri{
    public static void mainBasla(Calisan [] c){
        for(int i = 0; i < c.length; i++)
        {
            c[i].calis(); //Dikkat!
        }
    }
    public static void main(String [] args){
        Calisan[] c = new Calisan[3];
       // c[0] = new Calisan(); Hata!Soyut sınıflar new ile direct object oluşturamayız
       c[0] = new Programci();
       c[1] = new Mudur();
       c[2] = new Pazarlamaci();
       mainBasla(c);
    }
}

/**
 * Not : Calisan sınıfından türeyen sınıflar tarfından bu yordam iptal edilmek 
 * (override) zorundadır.Eğer bir sınıfın içersinde soyut(abstract) bir yordam varsa
 * o zaman bu sınıf da soyut (abstract) olmak zorundadır.Fakat soyut olan sınıfların 
 * içersinde normal yordamlarda bulunabilir.
 */