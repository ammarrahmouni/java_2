/**
 * Interface : şimdi interface demek ki(arayüz) ne yapar? interface 
 * objectler arasında bir ilişki kuruyor şunada öyle bilelim.
 * Nasıl kullanıyor ? class kelimesi yerine interface kelimesi yazıyoruz
 * bunun içinde metotlar kesinlikle body olmayan metotlar içermelidir.
 * Abstract ise hem body olmayan hem body olan metotlar içerir
 * Interface durumu sadece body olmayan metolar içerir.
 * interface'den objectler de oluşturamayız (yane new ile kullanılamayız)
 * Beki bu metotlar nasıl çalışır ? Başka class implements kelimesi
 * kullanarak ordaki metotlar kesin ve kesin override yaparak kullanabiliriz.
 * Eğer override yapmasak program hata verir.implements yapan class içinde 
 * başka metotlar ya da değişkenler içerebilir.
 * interface tipine parametre olarak gönderebiliriz lakin dikkat etmemiz husus
 * interface tipine objectleri gönderemeyiz zaten objectler oluşturamayız
 * beki o zaman nasıl interface  tipinde objectler göndreceğiz işte 
 * implements olan class'larında objectleri göndeririz.
 */

interface Inter{
    public void printData();
    public void getData();
    public int add();
    
}
class App implements Inter{
    public void printData(){ //Override zorunda
        System.out.println("This is printData(); metot from App class");
    }
    public void getData(){ //Override zorunda
        System.out.println("This is getData(); metot from App class");
    }
    public int add(){ //Override zorunda
        return 0;
    }
    public void hello(){
        System.out.println("Welcome");
    }
}
class App2 implements Inter{
    public void printData(){    //Override zorunda
        System.out.println("This is printData(); metot from App2 class");
    }
    public void getData(){  //Override zorunda
        System.out.println("This is getData(); metot from App2 class");
    }
    public int add(){   //Override zorunda
        return 10;
    }
    public void than(){
        System.out.println("Thank You!");

    }
}
public class MyInterface {
    public static void mainBasla(Inter t){
        t.printData(); //Dikkat
        t.getData();    //Dikkat
    }
    public static void main(String[] args){
        
        App a = new App(); //Inter a = new App(); dogru
        App2 e = new App2(); //Inter b = new App2(); dogru
        mainBasla(a);
        mainBasla(e);

    }
}