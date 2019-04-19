//interface ile extends 

interface Kosabilme{
    public void kos();
}
interface DahaHizliKosabilme extends Kosabilme{
    public void dahaHizliKos();
}
interface Avlanabilme extends DahaHizliKosabilme{
    public void avlan();
}
class RoadRunner implements DahaHizliKosabilme{
    public void kos(){
        System.out.println("RodaRunner Kosuyor, bip");
    }
    public void dahaHizliKos(){
        System.out.println("RodaRunner Kosuyor, bip bippppppp");
    }
}
class juqar implements Avlanabilme{
    public void avlan(){
        System.out.println("juqar avlaniyor");
    }
    public void kos(){
        System.out.println("juqar Kosuyor");
    }
    public void dahaHizliKos(){
        System.out.println("juqar daha hizli Kosuyor");
    }
}
public class InterfaceExirsice3{
    public static void main(String[] args){
        RoadRunner r = new RoadRunner();
        juqar j = new juqar();
        r.kos();
        r.dahaHizliKos();
        System.out.println("------------------");
        j.kos();
        j.dahaHizliKos();
        j.avlan();
    }
}
/**
 * juqar sınıfı Avlanabilme interface'i ulaşarak avlan(), dahaHizliKos(), kos(),
 * yordamlarını override yapmak zorunda kalmıştır.
 * Bunun sebebi Avlanabilme arayüzünün DahaHizliKosabilme arayüzünden , DahaHizliKosabilme
 * arayüzünden Kosbilme arayüzünden türemiş olmasıdır
 * RoadRunner sınıfı ise sadece DahaHizliKosabilme arayüzünde erişerek kos() ve
 * dahaHizliKos() gövdesiz (soyut) yordamlarını override zorunda bırakılmıştır
 * Yine bunun sebebi DahaHizliKosabilme arayüzünün Kosabilme arayüzünde türemiş olmasıdır.
 */