interface Arayuz1{
    public void a1();
}
interface Arayuz2{
    public void a2();
}
abstract class Soyut1{
    public abstract void s1();
}
class A extends Soyut1 implements Arayuz1, Arayuz2{
    public void s1(){
       System.out.println("A.s1();");
    }
    public void a1(){
        System.out.println("A.a1();");
    }
    public void a2(){
        System.out.println("A.a2();");
    }
}
public class InterfaceExirsice5{
    public static void main(String[] args){
       // Soyut1 soyut_1 = new Soyut1(); Hata
       // Arayuz1 arayuz_1 = new Arayuz1(); Hata
       // Arayuz2 arayuz_2 = new Arayuz2(); Hata
       Soyut1 soyut_1 = new A();
       //A r = new A(); boyle kullanırsak arıka her metodu eişliebilir
       //r.s1(); r.a1(); r.a2(); dogru
       /* (Type casting) burda yaptığı iş aslında arayuz_1 değişkeni soyut_1 
          değişkeni kullanarak Soyut1 tipinden Arayuz1 tipine çevrdi ve arayuz_1 
          değğişkende kaydetti
       */
       Arayuz1 arayuz_1 = (Arayuz1) soyut_1; //  Arayuz1 arayuz_1 = new A(); dogru
       Arayuz2 arayuz_2 = (Arayuz2) soyut_1; // Arayuz2 arayuz_2 = new A(); dogru
       //Arayuz2 arayuz_2 = (Arayuz2) arayuz1; //dogru
       soyut_1.s1();
       //soyut_1.a1(); //Hata
       //soyut_1.a2(); //Hata
       arayuz_1.a1();
       //arayuz_1.a2(); //Hata
       //arayuz_1.s1(); //Hata
       arayuz_2.a2();
       //arayuz_2.a1(); //Hata
       //arayuz_2.s1(); //Hata
    }
}
/**
 * A sınıfın ait üç nesne oluşturduk ve bu nesnelerin her birini farklı tipteki 
 * referanslara bağlayaabildik
 */