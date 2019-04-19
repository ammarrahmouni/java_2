/**
 * Her oluşturduğmuz class'lar aslında bunlar hepsi otomatik ve gizli olarak
 * Object Class'inda türetilmiş zaten ondan dolayı biz diyoruz ki java'da
 * her şey bir Object'tir.tabi bu Object class içinde metotlar var 
 * (equals, toString, getClass,.......) gibi metolar ve her class o object 
 * class'inda türevlendiği için artık oluşturduğumuz class'lar
 * bu metotları kullanabilir.
 * Bu ornek için gördüğümüz gibi bu oluşturduğumuz class'lar
 * boş olduğuna rağman bir kac metot kullandık aslında bu metotlar object 
 * class'inda kaynaklanır.
 * Eğer bir metot'ta bir Object tipi bir parametre alırsak o demek ki 
 * o parametreden gelen hir oblect alabilir yani o object her hangi bir calss'tan
 * yarıtıysak o parametreye gönderebilir.
 * Benzer şekilde bir Object tipi bir metot tanımlarsak demek ki o metot her hangi
 * bir object döndüryor o object her hangi bir class'tan türetmiş fark etmez çünkü zaten
 * her class Object class'indan türetilimiş.
 */
public class ObjectClass{
    public static void getDate(Object o){
        System.out.println(o.equals(o));
    }
    public static Object setDate(){
        Dog d = new Dog();
        return d;
    }
    public static Object test(){
        Cat c = new Cat();
        return c;
    }
    public Dog start(){
        Dog re = new Dog();
        return re;
    }
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        if(d.equals(c))
        {
            System.out.println("d is equals c: True");
        }
        else
        {
            System.out.println("d is not equals c: False");
        }
        System.out.println("d.getClass(): " + d.getClass());
        System.out.println("c.getClass(): " + c.getClass());
        System.out.println("d.hashCode(): " + d.hashCode());
        System.out.println("c.hashCode(): " + c.hashCode());
        System.out.println("d.toString(): " + d.toString());
        System.out.println("c.toString(): " + c.toString());
        System.out.println("d Object: " + d);
        System.out.println("c Object: " + c);
        System.out.println("--------------------------");
        getDate(d);
        getDate(c);
        System.out.println("--------------------------");
        //Burda setDate() gelen object Dog tipine dönüştürdük ardığından onun değeri o object'te kaydettik.
        Dog o = (Dog) setDate();
        o.rest();
        Cat t = (Cat) test();
        t.rest();
        System.out.println("--------------------------");
        System.out.println(o.getClass().getName());
        System.out.println(t.getClass().getName());
        System.out.println("--------------------------");
        ObjectClass ob = new ObjectClass();
        ob.start().rest();
    }
}
class Dog{
    public void rest(){
        System.out.println("This is class Dog");
    }
}
class Cat{
    public void rest(){
        System.out.println("This is class Cat");
    }
}