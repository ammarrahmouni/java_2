/**
 * Abstraction

 * Data abstraction provides the outside world with only essential information, 
 * in a process of representing essential features without including implementation details.
 * A good real-world example is a book. When you hear the term book, you don't know the exact specifics,
 * such as the page count, the color, or the size, but you understand the idea, or abstraction, of a book.
 * The concept of abstraction is that we focus on essential qualities, 
 * rather than the specific characteristics of one particular example.

 * In Java, abstraction is achieved using abstract classes and interfaces.
 * An abstract class is defined using the abstract keyword.
 * - If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).
 * - To use an abstract class, you have to inherit it from another class.
 * - Any class that contains an abstract method should be defined as abstract.
 * An abstract method is a method that is declared without an implementation 
 * (without braces, and followed by a semicolon): abstract void walk();
 */
/**
 * Abstract With Class: Demek ki Souytlamak (تجريد) class ve metot tnımaları için kullanılır.
 * Bir class abstract olarak tanımlarsak Bu class'ından object oluşturamayız.
 * (Yani new ile abstract olamaz)
 * Beki eğer object oluşturamask ne için kullanılır;inheritance ve polymorphism 
 * için kullanılır biz bazen Ana calss oluşturuyoruz ve ondan herhangi bir object
 * oluşturmasını istemiyoruz ondan class'lar türetmesi istiyoruz ardından o yeni
 * türetilen classlar object oluşturabiliriz.
 */
/**
 * Not kavram : concrete class abstract olmayan classlar
 */
/**
 * Abstract With Metot: şimdi eğer abstract metot ile kullanmak istiyorsak önce
 * kesinlikle bu metot abstract tipi bir class içinde olmalıdır.
 * Eğer metotdu abstract olarak tanımlarsak bu metodu gövdsi(body) yoktur
 * (public abstract metot_tipi metot_adı();) Böyle tanımlarız
 * bu metodu türetilen class'ları override yaparak kullanılabilir ve yapmak zorunda.
 * Not 1: alt sınıflar o metodu override yaparken abstract kelimesi kullanılmaz.
 * Not 2: bir metodu tanımlarken abstract ile static aynı anda kullanamayız.
 * Not 3: Constructor metodu tanımlarken abstract ile tnaımlamayız.
 */

 /**
  * Bir sınıfın soyut olması için , Bu sınıfın içersinde en az bir adet soyut
  * yordamının bulunması gerekir.Soyut yordamların gövdesi bulunmaz; yani içi boş
  * hiç birşey yapmayan yordam görünümündedirler.Soyut Bir sınıfından türetilmiş alt
  * sınıflar Bu soyut sınıfın içersindeki soyut yordamları Kesin olarak iptal etmeleri
  * (Override) gerekmektedir.Eğer türetilmiş sınıflar Soyut olan ana sınıflarına 
  * ait bu soyut yordamları iptal etmezlerse , derleme anında (compile-time)
  * hata ile karşılaşılır.Soyut sınıfların içersinde soyut yordamlar olacağı gibi
  * gövdeleri olan yani iş yapan yordamlar bulunabilir.
  */

abstract class Shape{
    public int x = 0;
    public int y = 0;
    public String name;

    // Constructor metot
    public Shape(String name){
        this.name = name;
    }
    // Normal metot
    public void print(){
        // Bu metot sadece A türetilen class'lar kullanabiliriz çünkü zaten A'dan bir object olşturamayız
        System.out.println("This is no abstract metot");
    }
    //abstract metot
    public abstract void Draw(); 
    // Static metot
    public static void printShape(){
        /*Bu metot A class'i kullanarak çağırılabiliriz çünkü o metot static ve static metotlar 
          object olşturmadan kullanbiliriz.
          Zaten Static metotlar calss'lara ait özel metotlar
        */
        System.out.println("This is static  metod From Shape");
    }
}

class Rect extends Shape{
    int x = 10;
    public Rect(){
        super("Rect");
    }
    @Override
    public void Draw(){ //override zorunda
        System.out.println("This is abstract metot From Rect");
    }
    
    public static void printShape(){ //override zorunda değil
        System.out.println("This is static metot From Rect");
    }
}

class Circ extends Shape{
    int y = 47;
    public Circ(){
        super("Circ");
    }
    @Override
    public void Draw(){ //override zorunda
        System.out.println("This is abstract metot From Circ");
    }
    public static void printShape(){ //override zorunda değil
        System.out.println("This is static metot Fronm Circ");
    }
} 

public class Abstract{
    public static void Start(Shape s)
    {
        /**
         *  Burda Biz Shape tipinden bir object göndermeyeiz çünkü Shape class abstract bir class'tir
         *  ona rağman hata vermedi, lakin Shape türetilden calss'ları gönderebiliriz, Circ ve Rect
         *  tipinden objectler gnderebiliriz
         */
        if(s instanceof Circ)  // instanceof demek (نسخة)
        {
            System.out.print("X ");
            s.Draw();
        }
        else if(s instanceof Rect)
        {
            System.out.print("Y ");
            s.Draw();
        }
        else 
            System.out.println("None");
    }
    public static Shape ret(){
        Shape e = new Circ();
        Shape t = new Rect();
        if(e.equals(t))
            return e;
        else 
            return t;
    }
    public static void main(String[] args){
        // Shape a = new Shape(); !Hata! çünkü A class'i abstract
        Rect b = new Rect();
        Circ c = new Circ();
        // s dir object doğru lakin Sahpe'ten değil Rect'ten oluşturlmuş
        Shape s = new Rect(); //Dikkat -Doğrudr-
        Shape r = new Circ(); //Dikkat -Doğrudr-

        System.out.println("Rect name : " + b.name);
        System.out.println("Circ name : " + c.name);
        System.out.println("--------------------");
        System.out.println("b.x : " + b.x);
        System.out.println("b.y : " + b.y);
        System.out.println("c.x : " + c.x);
        System.out.println("c.y : " + c.y);
        System.out.println("--------------------");
        b.print();
        c.print();
        System.out.println("--------------------");
        Shape.printShape();
        Rect.printShape();
        b.printShape();
        Circ.printShape();
        c.printShape();
        System.out.println("--------------------");
        Start(b); // (upcasting)
        Start(c); // (upcasting)
        System.out.println("--------------------");
        Start(s);
        Start(r);
        System.out.println("--------------------");
        System.out.println(ret().name);

    }
}
