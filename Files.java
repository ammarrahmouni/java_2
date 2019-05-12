import java.io.*;   
import java.io.IOException;
/**
 * File sınıfın kullanımı: Bu sınıf bilgisayar üzerindeki bir dosaynın bilgilerine erişmeyi sağlar 
 * File sınıfın bilgisayar üzerindeki herhangi bir dosya ile ilişkendilirerek bu dosay hakkında birçok
 * bilgiye ulaşırız.Bu sınıfın yaoıcısına işlem yapacağımız dosya veya klasörün path adresini veririz.
 * Bu path dosaynın bilgisayar üzerindeki adresidir.
*/
/**
 * Not : File sınıfı (java.io.File) package'ten import etmeliyiz.
 * Not : File sınıfından üretiğimiz nensne aslında bu nesne yazdırısak o dosyanın adresi(Path)
 */
public class Files{
    public static void main(String[] args) {
        //Kullanımı -1-:
        File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\files.txt");
        //Kullanımı -2-:
        String s = "C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\files1.txt";
        File fs = new File(s);
        //Dosya oluşturmak :
        //Neden try and catch kullandık? Bu path yolu hata olabilir,ondan dolayı kullandık.
        try{
            f.createNewFile(); //Bu metodu bir dosya oluşturmak için kullanılır.
            System.out.println(f.getName()); //Bu metod dosaynın adını verir.
            System.out.println(f.getAbsolutePath()); //Bu metodu dosaynın yolunu verir.
            System.out.println(f.length()); //Bu metod dosaynın karakterlerin sayına verir.Lakin dikkat edelim eğer o sayının işlemler yapacaksak o değer int'e çevermeliyiz
            f.renameTo(fs); //Bu metod dosayyı adını değiştiriyor, Bu metot içersinde yeni bir file tipinde nesne vermemiz gerekir.
            //Not: eğer dosaynın adı varsa oa zaman dosaynın adı değiştiremez.
            System.out.println(f.exists()); //Bu metod dosayyı bulup bulunmadığını söyler.
        }catch(IOException e){
            e.printStackTrace(); //Bu metod hatanın detaly bir şekilde konsola yazılmasını sağlar.
        }
        
    }
}
/**
 * File sınıfından f adında bir nesne oluşturduk.Dosya işlemleri bu nesne üzerinde yapılır.Parantezler
 * içersinde işlem yapılacak dosaynın yolu vermelidir.Bu File sınıfı dosya veya klasörler için kullanılır.
 */

/**
 * Dosyanın ya klasörün yolunu doğrudan yapıcıya göndermek yerine bir String nesnesine atıp o nesneyi gönderebiliriz. 
 */
