/**
 * Interfaces

 * An interface is a completely abstract class that contains only abstract methods.
 * Some specifications for interfaces:
 * - Defined using the interface keyword.
 * - May contain only static final variables.
 * - Cannot contain a constructor because interfaces cannot be instantiated.
 * - Interfaces can extend other interfaces.
 * - A class can implement any number of interfaces.
 * When you implement an interface, you need to override all of its methods.
 * Use the implements keyword to use an interface with your class.
 */

interface Animal {
    int legs = 0;
    //int y; //Hata ilke değer atmalıyız. 
    public void eat();
    public void makeSound();
    //private int top(); //Hata interfacce içindeki yordamları erişim belirleyici public 
}

class Cat implements Animal {
    public void makeSound() {
      System.out.println("Meow");
      System.out.println(legs);
    }
    public void eat() {
      //legs = 8; //hata çünkü interface'in içindeki değişkenler fianl ve static değişkenler yani değerleri değişmezler
      System.out.println("omnomnom");
      System.out.println(legs);
    }
}
public class Interface{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
        c.eat();
    }
}
  /**
   * Interfaces have the following properties:
   * - An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
   * - Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
   * - Methods in an interface are implicitly public.
   * A class can inherit from just one superclass, but can implement multiple interfaces!
*/
