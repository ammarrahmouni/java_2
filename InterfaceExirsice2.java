/**
 * Burda dikkat edilmemiz gereken şey bir abstract tipi bir class bir interface'e
 * implements yaptı.şimdi artık bu class'inda istersek interface'in metotları override
 * yapmayı zorunda değiliz isterse yaparız isterse yapmayabiliriz.lakin eğer o abstract
 * class'inden bir class'lar türetiyeceksk orda artık o interface metotları override yapmak 
 * zorundayız.
 * Not : eğre abstract class'inda interface yordamları override yapacakasak 
 * o abstract class'inda türetilecek class'lar interface'in yordamlarını 
 * override yapmayı zorunda kalmayazak.
 */

interface Hayvan{
    public void avlan();
}
abstract class Kedi implements Hayvan{
    public abstract void takipEt();
}
class Kaplan extends Kedi{
    public void avlan(){ //override zorunda
        System.out.println("kaplan avlaniyor..");
    }
    public void takipEt(){ //override zorunda
        System.out.println("kaplan takip ediyor..");
    }
}
public class InterfaceExirsice2{
    public static void main(String[] args){
        Kaplan k = new Kaplan();
        k.avlan();
        k.takipEt();
        
    }
}
/**
 * soyut(abstract) olan kedi sınıfın içersinde, herhangi bir gövdesiz yordaım(soyut yordam)
 * iptal edilmemiştir(overrid) iptal edilme işleminin gerçekleştiği tek yer kaplan sınıfı
 * soru : kapılan sınıf hayvan arayüzünde (interface) tanımlanmış soyut olan gövdesiz 
 * avlan() yordamını iptal etmek (override) zorunda mı?
 * cevap : Evet , çünkü kapılan sınıfı kedi sınıfından türetilmiş . kedi sınıf 
 * ise hayvan arayüzüne ulaşmaktadır.Bu sepeten dolayı kaplan sınıfın içersinde 
 * avlan() yordamı iptal edilmelidir. 
 */

 /**
  * interface ile abstract arasında fark nedir?
  * abstract bir class türetilme yapıldığ zaman türetilen calss ile abstract class 
  * mantıksal bir ilşki olsı gerekir.örnek vermek gerekirse 
  * "mudur bir calışandır" ya da "keplan bir hayvandır" gibi .Fakat interface ile bunlar
  * erişin sınıflar arasında kalıtmasal bir ilişki bulunmayabilir.
  */