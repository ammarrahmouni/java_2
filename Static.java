// Static Methodlar ve Static Değişkenler
/**
 * Kural 1:Bir method ya bir değişken static olarak tanımlanmişsak o zamana bu değişkeni
 * ya da o methodu artık object değişkeni değil class'ın değişkeni sayılır.
 * Ve o methode çağırılacaksak class'ın adı ile cağırılırız.ve burda object
 * oluşturması bir manesi yoktur çünkü her oluşturduğumuz object aynı
 * değer alacak.
 */

/**
 * Kural 2:Eğer biz aynı class'ın içinde bir metod static olarak
 * tanmlanışsak bunu çağırırken iki yolu vardır;
 * Birincisi:class'ın adı nokta metodun adı ile çağırılır.
 * Ikıncisi:Sadece metodun adı ile çağırılabailiriz.
 * lakin Dikkat edeilmemiz gereken aynı class'ta olmak.
 */
/**
 * Kural 3:Bir metod static ise kesinlikle onun içinde this kullanamayız
 * çünkü;Biz this object adı ile değiştirmek için kullanıyoruz 
 * ve burda object olmadığı için çünkü o metodu class'a ait 
 * this kullanılamaz. 
 */
/**
 * Kural4: Static olan doyanım(yani metod ne dğişken) onların adı 
 * Class Members
 */
/**
 * Kural 5:Eğer bir class'ın içinde bir metod static olaran tanımlanmışsak
 * ve o calss'ında bir kaç tane değişken varsa o methodu sadece static olan
 * değişkenlere bir ilşki kurulabilir.Static olmayan değişkenler ordaki metod
 * ile her hangi bir ilişki kurulamaz.
 */
/**
 * Kural 6:Eğer bir class'ında private static bir değişkeni tanımlanmışsak
 * onu calss adı ile çağırılamaz çünkü;Bildiğimiz gibi private olanlar sadec
 * class'ın içinde erişilebilir.Eğer onun ile erişecekesek get ve set metotlar
 * ile erişilebilir lakin o metotlar da static olmalıdır. 
 */
public class Static{
    public static void exam(){
        System.out.println("The exam is Hard");
    }
    public static void main(String[] args){
        Os r = new Os();
        Os e = new Os();
        r.x = 10;
        e.x = 15;
        System.out.println(r.x);
        System.out.println(e.x);
        Os.y = 100;
        Os.Hello();
        //System.out.println(r.y); bu iki satırın kullanılması hata değildir lakin gereksizi
        //System.out.println(e.y); çünkü y değişkeni static olduğu için o class'ın değişkeni sayılır. 
        exam(); // Gürdüğmuz gibi bu methode adı ile çağırdık
        Static.exam(); //Burda class'ın adı ile çağırdık.
        //Hello(); Hata!-Dikkat bu aynı class'ı olmadığı için böyle çağırılamayaız.
        Os.setZ(41);
        System.out.println(Os.getZ());
    }
}
 class Os{
    public int x;
    public static int y;
    private static int z;
    public String r ;

    public static void Hello(){
        System.out.println("Welcome");
        //this.x = x Hata!
    }
    public static void setZ(int a){
        Os.z = a;
    }
    public static int getZ(){
        return z;
    }

}