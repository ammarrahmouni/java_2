package access;

    /*  
        javada bir paket oluştırmak için yazılmalan kod:
        javac -d . classname.java
        java packagename.classname
        Not:Burda en doğru değerlendirme önce object1 calss değerlendirmek 
        sonra AccessModProtect değerlendirilir
    */

public class AccessModProtect{
    public static void main(String[] args){
        object1 pr = new object1(0);

        /*
            Protect olan değişkenler sadec aynı paket olan erişebiliriz
            ya da kalıtım ile oluşturmuş alt sınıflar ereşebilir
        */ 
        pr.y = 50;
        System.out.println(pr.y);
        
        /* 
            public olan değişkenler programdaki herhangi bir fonksiyon tarafından 
            erişebilir.Dolaysıla public üye veya alanlara farklı paket ve sınıflardan
            erişilebilir.Ancak farklı pakettten erişilme durmunda program başında
            import edilmeleri gerekir. 
        */
        pr.speed = 10;
        System.out.println(pr.speed);

        /* 
            Not:Bu üç Belirteçten(public, privat, protected)hiçbiri kullanılmamışsa 
            Default olarak tanımalnmış demektir.Default uyleri sadece tanmladığı paket 
            içersinde erişeilebilir. 
        */
    }
}