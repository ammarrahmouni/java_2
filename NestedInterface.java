//Dahili arayüzler (nested interface)
/**
 * Bir arayüz başka bir arayüzün veya sınıfın içersinde tanımlanabilir.Bir arayüzün 
 * içersinde tanımlanan dahili arayüzler, protected, friendly veya private erişim 
 * belirleyecisine sahip olamaz.ana arayüz adı da (outer interface) ve dahili arayüz adı (inner inetrface)
 * Bu dahili arayüzler erişmek için tabi bir class'da implements kullanarak
 * erişilebiliriz.Erişim Yöntemi :
 * class_adı implements outer_inetrface.inner_interface
 * Dahili arauüzler erişin sınıflar açısından olaylar aynıdır Yine bu dahili arayüzlerin
 * içersindeki gövdesiz yordamları override yapmayı gerekmektedir.
 * Not : Eğer outer interface içinde metotlar vars ve aynı anda içinde inner interface
 * ardığında biz o inner interface erişmek istediğimizde outer interfce'in metotlar'ı
 * override yapmayı gerek yoktur. Zaten biz outer inetrface'i Bir işimiz yoktur
 * işimiz sadece inner inetrface ve onun içindeki metotlar artık override yapmayı
 * zorundayız.
 */
interface ArayuzA{ //aslında public erişiem belirleceysine sahip
    public void isYap();

    public interface DahiliArayuz1{
        public void isYap1();
    }
    /** //Hata!
     * protected interfae DahiliArayuz2{
     * public void isYap2();
     * }
     */
    interface DahiliArayuz3 { //aslında public erişiem belirleceysine sahip
        public void isYap3();
    }
    /**
     * //Hata!
     * private interface Dahiliarayuz4{
     * public void isYap4();
     * }
     */
}
class Erisim1 implements ArayuzA.DahiliArayuz1{
    public void isYap1(){
        System.out.println("Erisim1.isYap1();");
    }
}
class Erisim3 implements ArayuzA.DahiliArayuz3{
    public void isYap3(){
        System.out.println("Erisim3.isYap3();");
    }
}
class Erisim4 implements ArayuzA{
    public void isYap(){
        System.out.println("Erisim4.isYap();");
    }
}
public class NestedInterface{
    public static void main(String[] args){
        Erisim1 e1 = new Erisim1();
        Erisim3 e3 = new Erisim3();
        Erisim4 e4 = new Erisim4();
        e1.isYap1();
        e3.isYap3();
        e4.isYap();
    }
}