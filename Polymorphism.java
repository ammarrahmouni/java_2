//Polymorphism
/**
 * Polymorphism:Bu kavram javada çok ve çok önemli bir kavramdır.
 * Biz bir fonk çağrıyoruz ve bu fonk içinde başka bir fonk çağrıyor 
 * lakiiiin o fonk hangi object'ten çağıracağını bilemiyor.
 * Şimdi biz burda bir class'lar oluşturduk D Class'ında parametreli bir 
 * fonk olşturduk o parametreyi bir object alıyor A Class'ı tipinden bir 
 * objecttir.Şimdi Polymorphism class'ında o fonk çağırdık ve bir object 
 * A tipinden bir oject gönderdik.Şuana kadar yaptığmız her şey normaldır 
 * sonra A class'ında iki class türetik bunlar B ve C class'lar
 * ve o calss'larda print fonk override yaptık sonra Polymorphism
 * class'ında o class'lardan object oluşturduk  ve poly fonksiyonu 
 * o objectleri gönderdik işteeeeee burda çok önemli biz A tipniden
 * objectleri göndermediğimize rağman hata vermedi çünkü B ve C classlar
 * A classında türevlenmiş demek ki poly fonk hem A class'indan hem de 
 * A'dan türevlenen class'ları da alabilir.
 * Bir yerden değişik fonk çağırdık zaten Polymorphism demeki bir çok şekil demektir.
 * burda objectler deiğşiyorlar.
 * Bir metot birden daha fazla şekil il çalışır.
 * Adımlar :
 * önce super_class'ta bir metot oluşturyoruz sonra
 * sup_class'lar o metotu override yaparız.Eğer override yamazsak 
 * Ana calss'ında aynı metotu kaullanılacak.
 * 
 */
public class Polymorphism{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        a.print();
        b.print();
        c.print();
        System.out.println("-----------------------");
        d.poly(a); //polymorphism
        d.poly(b); //polymorphism
        d.poly(c); //polymorphism
        System.out.println("-----------------------");
        a.add(4 , 5);
        b.add(4 , 5);
        c.add(4 , 5);
        System.out.println("-----------------------");
        d.add(a , 7 , 3);
        d.add(b , 7 , 3);
        d.add(c , 7 , 3);
    }
}
class A{
    public void print(){
        System.out.println("Class From A");
    }
    public void add(int x, int y){
        System.out.println("Add x + y: " + (x + y));
    }
}
class B extends A{
    @Override
    public void print(){
        System.out.println("Class From B");
    }
    public void add(int x, int y){
        System.out.println("Add xy: " + x + y);
    }
}
class C extends A{
    @Override
    public void print(){
        System.out.println("Class From C");
    }

}
class D{
    public void poly(A value){
        value.print();
    }
    public void add(A a, int x, int y){
        a.add(x, y);
    }
}