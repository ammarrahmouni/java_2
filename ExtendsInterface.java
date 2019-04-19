/**
 * Not : interface ile başka interface extends kullanırız.
 *       class ile başka class extends kullanırız.
 *       class ile interface implements kullanırız.
 * şimdi bir problem var Eğer biz bir interface oluşturusak ve o 
 * interface çoğu calss'lar implements yapıyor, ardığndan biz o interfae'i
 * bir kaç tane metodu ekledik artık biz bazı class'lar o metodlar 
 * override yapmak istiyoruz böylece bildiğimz gibi eğer her class'lar override yapmasak 
 * hata vercek beki bu problmi nasıl çözüeceğiz ?
 * çözüm : bir intrface olşturuyorz ve o interface ana interface extends 
 * yapıyoruz.artık o interface'i içinde ana interface bütün metolar vardır 
 * sonra biz buraya istediğimiz metolar oluşturuzu ardığında istediğimz 
 * class'lar ana interface değil yeni interface implements yaptırabiliriz.
 */
interface App{
    public void getData();
}
interface App2 extends App{
    public void printData();
}
class Test implements App{
    public void getData(){
        System.out.println("This is getData(); metodu from class Test");
    }
} 
class Test1 implements App2{
    public void getData(){
        System.out.println("This is getData(); metodu from class Test1");
    }
    public void printData(){
        System.out.println("This is printData(); metodu from class Test1");
    }
}
public class ExtendsInterface {
    public static void main(String[]  args){
        Test t = new Test();
        Test1 t1 = new Test1();
        t.getData();
        //t.printData(); Hata!
        System.out.println("----------------");
        t1.getData();
        System.out.println("-----------------");
        t1.printData();
    }
}