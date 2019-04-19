//Final With Method
/**
 * SuperClass'ında bir Fianl methodu tanımlarsak demek ki
 * subClass'ında bu metodu Override yapamayız.Her ne kadar ana sınıfında
 * sınıflar türetilirsek o sınıflarda o metodu hiç bir zamanda iptal edemeyiz.
 * o Sınıfı kullanabiliriz lakin iptal edemeyiz.
 * Not: biz dedik ki Override yapamayız lakin Overloading yapabiliriz.
 * Hem SuperClass'ın içinde hem de subClass'ların içinde Overloading yapabiliriz.
 */
class A{
    public final int x = 0;
    public final void write(){
        System.out.println("WelCome");
    } //OverLoading
    public final void write(int c){
        System.out.println("OverLoading Yaptik A");
    }
    public void open(){
        System.out.println("Open the Book");
    }
}
class B extends A{
   /**
    *   @Override
    *   public final void write(){
    *   System.out.println("What's your name?");
    *   } Hata!Çünkü o metodu Final tipinde 
    */
    @Override
    public void open(){
        System.out.println("Close The Book");
    }  
    //OverLoading
    public final void write(float c){
        System.out.println("OverLoading Yaptik B");
    }
}
class C extends B{  
    @Override
    public void open(){
        System.out.println("Read The Book");
    }
    //OverLoading
    public final void write(double c){
        System.out.println("OverLoading Yaptik C");
    }
}
public class FinalWithMethod{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        a.write();
        b.write();
        c.write();
        System.out.println("------------");
        a.open();
        b.open();
        c.open();
        System.out.println("------------");
        a.write(5);
        b.write(5.5f);
        c.write(5.5);      
    }

}
