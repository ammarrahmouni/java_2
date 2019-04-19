//Constructor ve Inheritance(kalıtım ve ilk değer almak sırası).

class Hayvan{
    public Hayvan(){
        System.out.println("Hayvan Yapilandiricisi.");
    }
}
class Kedi extends Hayvan{
    public Kedi(){
        System.out.println("Kedi Yapilandiricisi.");
    }
}
class Kaplan extends Kedi{
    public Kaplan(){
        System.out.println("Kaplan Yapilandiricisi.");
    }
}

public class ConstructorInheritance extends Kaplan{
    public ConstructorInheritance(){
        System.out.println("ConstructorInheritance Yapilandiricisi.");
    }

    public static void main(String[] args){
        /*
        * Şimdi Bildiğimiz gibi Constructor fonk bir object oluşturduğumuzda
        * çalışır.Burda oluşturduğumuz object onunu ait sınıfı(Kaplan) başka
        * sınıfında türetilmiş (Kendi).O türetilinden(Kedi) sınıfı o da başka 
        * sınıfından da türetilmiş (Hayvan).
        * Sonuç: ilk önce Parent class (SuperClass) kendi ypıldırıcıcsı
        * çalışır.Bu örnek için (Hayvan Kedi Kaplan) sırasıyla çalışır.
        */
        Kaplan x = new Kaplan();
        System.out.println("-----------------------");
        Kedi y = new Kedi();
        System.out.println("-----------------------");
        Hayvan z = new Hayvan();
        System.out.println("-----------------------");
        ConstructorInheritance r = new ConstructorInheritance();

    }
}
