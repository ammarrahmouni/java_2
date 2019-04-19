//Not: bu kod burda çaışmayabilir başka program kullan.
//Not: Bu kod desktop üzerinde çalışır
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * Throw kelimesi demek ki bir Exception at yani biz bir methodu 
 * olştururken buna yababiliriz o methodu belli koşullarda bir 
 * Exception at.şimdi Exception yapan metodlar adı Exception thrower
 * ve bu iki şeyi bölürüz; Birincisi : Exception catcher, 
 * bu demek ki o hatayı kendi methoduna düzenlet yani kendi metodunda
 * bir try ve cathc blocklar oluştur.
 * ikincisi: Exception propagtor,o demek ki bu metodu bir Exception atyacak 
 * lakin kendi metodunda düzenlemyecek o metoduna çağırdığında orda düzenleyebiliri.
 * Eğer metodu Exception catcher olarak tanımlarsak o zaman kesinlikle metodun 
 * içinde try ve catch olmalıdır.
 * Eğer metodu Exception propagtor olarak tanımlarsak kesinlikle çağırdımızda 
 * try ve catch olmalıdır.Runtime Exception metodlar hariç.
*/

/**
 * java.lang:Eğer bir (java.lang)package'inden bir class kullanackasak
 * import yazmayı gerek yoktur çünkü o varsayılan bir package'tir.
 * java zaten import yazmadan otomatik olarak onun içinde her class'ları
 * çağrıyor.Ama (java.util) onu yazmalıyız.
*/
public class ExceptionThrower{
    public static void main(String[] args){
        A a = new A();
        a.get(10); // Exception catcher metodu;

        try{
            a.set(10); //Exception propagtor metodu;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            a.readA(10);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        B b = new B();
        try{
            b.readB(10);
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        
    }

}
class A{
    // Exception catcher;
    public void get(int a){
        try{
            if(a == 10)
            {
                //Exception r = new Exception("Please dont enter a 10"); aşağıdaki satır ile aynı.
                //throw r;
                throw new Exception("Please dont enter a 10");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Exception propagtor
    public void set(int a) throws Exception,ArithmeticException,InputMismatchException 
    {                             //bunlar hata çeşitlerinin birini at ve birdan daha fazla hata tipi koyabiliriz.
        if(a == 10)
        {
            throw new Exception("Please dont enter a 10");
        }
    }
    //Exception propagtor
    /**
     * burda bu metodu Exception propagtor bir metodu lakin deikkat etiğimiz gibi
     * (throws InputMismatchException) falan yazmadık çünkü burda Exception tipi programı çalıştığımızda 
     * belirlenir.(InputMismatchException) bu exception kullanıcı yanlış bilgileri girdiğinde
     * Exception olur ondan dolayı o satırı istersek yazıp istersek yazmayabilir.
     * bu adı runtime exceptions.Hata o methodu çağırdığımızda istersek try ve catch yazıp
     * istersek yazmayabiliriz.eğer yazmasak program hata vermez lakin messageyi yazdırmaz
     * çünkü Exception düzenlemedik yani yazarsak daha iyi olur.
     */
    public void readA(int a) 
    {
        if(a == 10)
            throw new InputMismatchException("Please dont enter a 10");
    }
}
//Kendi Exception olşturmaktadır.(InputMismatchException, ArithmeticException, ....)
class MyException extends Exception{
    /**
     * ilk önce oluşturduğmuz class'i Exception class'ından extends omalıdır.
     * Excepiton class'İ bir constructor metodu vardır o zaman bir constructor fonl olşturmalıdır.
     */
    public MyException(String s){
        super(s);
    } // ya da 
    public MyException(){
        super("Please dont enter a 10");
    }
}
class B{
    public void readB(int a)throws MyException
    {
        if(a == 10)
            throw new MyException();
    }
}