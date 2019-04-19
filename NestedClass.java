// Dahili sınıflar (inner class)
/**
 * dahili sınıflar JDK 1.1 ile gelen bir özelliktir.Bu özelik saysende bir sınıf diğer 
 * bir sınıfn içersinde tanımlanabilir.Böylece mantıksal bütünü oluşturan 
 * bir çok sınıf tek bir çatı altında toplanabilir.Dahili sınıflar ypısal olarak 
 * 3 gruba ayırılabilir.
 *  1- Dahili üye sınıflar 
 *      -static dahili sınıf
 *      -staic olmayan dahili sınıf
 *  2- Yerel sınıflar (Local classes)
 *  3- isimsiz sınıflar (Anonymous classes)
 */
public class NestedClass{
    public class Toplama{ //Dahili üye sınıf(static olmayan dahili calss)
        public int toplamaYap(int a, int b){
            return a + b;
        }
    } //class Toplama
    public static void main(String[] args){
        NestedClass.Toplama nt = new NestedClass().new Toplama(); 
        // NestedClass n = new NestedClass();
        // NestedClass.Toplama nt = n.new Toplama(); //dogru

        int sonuc = nt.toplamaYap(4 , 5);
        System.out.println("Sonuc = " + sonuc);
    }
}
/**
 * NestedClass sınıfın içersinde tanımlanmış Toplama sınıfı bir dahil üye sınıfıdır
 * NestedClass sınıf ise çevreleyici(outer sınıf) sınıftır.Toplama sınıfına ait bir nesne oluşturmak için
 * NestedClass sınıfına ait nesne olutşturmamız gerekir.
 */