// extends ile implements kullanmak
//isimsiz sınıflar(Anonymous class)
/**
 * bir class başka bir class'ından extnds yaparız aynı adnan o class 
 * başka interface implemnets yapark kullanabilriz.
 * Not : Eğer ana class'i başka interface'ler implementes yaparak 
 * ve tabi class'in içinde interface içindeki metotlar override yapark
 * ya da implements yapmadan ve class içinde o interface'leri aynı adı ile metolar 
 * oluşturark, şimdi o class'inda eğer bir class türetilirsek ve o class'i aynı anda
 * ordaki interface implements yapark artık o class'i eğer yukardai koşulları 
 * sağlandğında o class'in içinde interface'in metotları override yapmayı gerek olmayacak
 */

/**
 * Onmeli -1- : şimdiye kadar kullandığımız şey bir interface oluşturuz ardığından 
 * bir class oluşturyouz ve o class'i o interface'i implements yaparak kullanıyorduk.
 * şimdi onun yerine başka bir yöntem vardır; biz calss oluşturmadn aslında bu işi yapıyoruz.
 * Beki Nasıl ?? şöyle biz o interfac'in hem object hem de class aynı anda oluşturacağız lakin
 * isimsiz bir class'dır ve o class'i interface içindeki metotlar override yaparak işlerimiz
 * daha hızlı oldu. Oluşturmay yöntemi : 
 * interface_adı Object_adı = new interface_aı(){
 *  //override metotlar
 * };
 * şimdi burda bie az şaşırabiliriz çünkü önceden dedik ki interface ile new kullanamayız
 * lakin aslında burda yaptığımız iş isimsiz bir class ve aynı anda bir object oluşturduk.
 * sonuç : burda biz implements olmadan daha hızl bir yöntem bulduk.
 */

/**
 * Önemli -2- : yukardaki konuştuğumuz şey aslında burda aynı ile bahsedeceğiz
 * fark olan o isimsiz class bir paramtere olarak göndereceğiz o paramteryi kim alır
 * o interfce tipindeki paramtere olan metotlar alır.beki nasıl göndeririz.
 * burda sadece isimsiz bir class değil hem isimsiz bir class hem de isimsiz bir object'tir parametre olarak gönderdik
 * metod_adı(new interface_adı(){
 *  // override metotlar
 *  }); 
 */


interface App{
    public void getData();
}
interface App2 extends App{
    public void printData();
}
interface App3{
    public void temel();
    public void asd();
}
interface App4{

}
class Test1 implements App, App2{
    public void getData(){
        System.out.println("This is getData(); metodu from class Test1");
    }
    public void printData(){
        System.out.println("This is printData(); metodu from class Test1");
    }

}
class Test2 extends Test1 implements App, App2{
    //Burda gürdüğümüz gibi override yapmadık 
    // Bu metod constructor metod değil çünkü tipi vardı eğer tipi olmasa constuctor olurdu
    public void Test2(){
        System.out.println("This is test2(); metodu from class Test2");
    }
}
class First{
    public void toplam(Test2 t){
        t.printData();
        t.getData();
        t.Test2();
    }
    public void hell(App a){
        a.getData();
    }
    public void tru(App3 a){
        a.asd();
        
    }


}
public class AdvanceInterface{
    public static void main(String[] args){
        Test2 t2 = new Test2();
        First f = new First();
        f.toplam(t2);
    }
}
//Önmeli -1-
class InterfaceYeniYontem{
    public static void main(String[] args){
        First f = new First();
        //NON-name Class (Anonymous class)
        App a = new App(){ //!Dikkat!
            public void getData(){ //override 
                System.out.println("This is getData(); metodu from non-name class");
            }
        };
        f.hell(a); 
    }
}
//Önemli -2-
class ParametreInterface{
    public static void main(String[] args){
        First f = new First();
        //Anonymous class and Anonymous object as parametre
        f.tru( new App3() {
            public void temel() { //override
                System.out.println("This is temel(); metod from non_name and non-object ParametreInterface class");
            }
            public void asd(){
                System.out.println("asd");
            }
        });
    }
}
class AnonymousObjectAndAnonymousClass{
    public static void main(String[] args){
        //Anonymous object ve Anonymous class oluşturduk
        new App3(){
            public void temel(){
                System.out.println("This is Anonymous object and Anonymous class ");
            }
            public void asd(){
                System.out.println("asd");
            }
        }.temel();
    }
}
