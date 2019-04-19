//inheritance(kalıtım) Demek meras demektir.
/* 
   * Bu yöntemde yeni oluştıracağımız sınıf daha önce yazılmış ve döğrulanmış
   * olan sınıftan türetilir.Böylece yeni oluşan sınıf türetildiği sınıfın 
   * özellilklerine sahip olur;Ayrıca oluşan bu yeni sınıfın kendisine ait
   * yeni özellikleri de olabilir. 
*/

/*
* Şimdi burda önmeli kavramlar vardır (SuperClass) ve (subClass).
* Aşağıdaki örneketen A sınıfı B için Direct superClass,
* ve B sınıfı A için subClass.Şimdi B sınıfı C için 
* Direct superClass ve C sınıfı B için subClass.
* şimdi A sınıfı C için indirect superClass ve 
* C sınıfı A için subClass.
*/
/*
* Not:Önemli!! dikkat edeceğimiz gibi burda her sınıfta bir main methodu
* oluşturduk ve hata vermaz. Ana program çalıştığımızda yani Inheritance
* sınıfı değerlendiğimizde (class A, class B ve class C) main fonksiyonu
* çalışmaz sadece ana fonk çalışır.Ordaki main fonk çalıştırmak için 
* sadece (java A,....)değerlendirebiliriz.
*/
/*
* Her zaman yeni bir sınıf tanımladığımızda , java otomatik ve gizli
* olarak extends object ibaresini yerleştirilir.
* O halde object class her sınıfları için bir superClass'tir
*/
/*
* Not: Burda B sınıfı hem A sınıfından hem de object sınıfında
* türetilmiş diyemeyiz, çünkü her sınıf sadece ve sadece tek bir
* sınıfında türetilir.B sınıfı hem A hem de object özelliklerini taşır. 
* Object sınıfı en yüksek mertebede sayılır ondan daha yüksek bir
* sınıf yoktur.
*/
public class Inheritance{
    public static void main(String[] args){
        B x = new B();
        x.creatArray(5); // bu fonk B sınıfında olmadığına rağmen ulaşılabildik.
        x.printB();      //Bu fonk ise B, C sınıfa ve B sınıfında türeten sınıflara aittir.

        C y = new C();   //Bu işlem sonsuza kadar gider istediğimiz kadar sınıflar türetilebiliriz.
        y.creatArray(2);
        y.printA();
        y.printB();
        y.printC();
        // x.printC(); Hata!-çünkü o fonk C'ye ve C'den türeten sınıflar aittir.
    }
}
class A{

    public int []creatArray(int c){
        int []array = new int[c];
        for(int i = 0; i < c; i++)
        {
            array[i] = i + 3;
        }
        for(int i:array)
            System.out.println(i);
        return array;
    }
    public void printA(){
        System.out.println("This is class A");
        System.out.println("----------------");
    }
    public static void main(String[] args){
        System.out.println("Hello in the class A");
    }
}
class B extends A{
    public void printB(){
        System.out.println("This is class B");
        System.out.println("----------------");
    }
    public static void main(String[] args){
        System.out.println("Hello in the class B");
    }
}
class C extends B{
    public void printC(){
        System.out.println("This is class C");
        System.out.println("----------------");
    }
    public static void main(String[] args){
        System.out.println("Hello in the class C");
    }
}