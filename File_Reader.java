import java.io.*;
/**
 * FileReader : Bu sınıf ile dosya okuma işlemi yapar.
 * 1- FileReader sınıfı ile okuma yapabilmek için ilk olara File Sınıfından bir nensne oluşturmak 
 * ve bu nensneye dosya yolunlu vermek gerekir.
 * 2- Daha sonra FileReader sınfından bir nesne oluşturup sınfın yapıcısına File sınıfnadn 
 * oluşturduğumuz nensneyi parametre olarak verilmelidir.
 * 3- okunan veriler doldurmak için char tipinde bir dizi oluşturulur.
 * 4- read() metodu ile okunan veriler bu diziyi dodlurulur.
 * 5- Doldurlan bu dizi,String tipinde bir nesneye atılır.
 * 6- son olarak bu nesne ekrana yazdırılır.
 */
/**
 * Not : FileReader and FileWriter Bu sınıflar dosya okuma işlemi yaptığımızda veriler karakter bazlı(يستند) olarak
 * okunur.Karakter bazlı işlem yaptığı için karakter encoding vardır.Buffer kullanılmaz.
 * Karkter bazlı işlem yapıldığı için okunan veriler,char tipindeki bir diziye atılmaalıdır.çünkü
 * işlemleri karkter tabanlıdır.Yazma işlemlerinde diziye gerek yoktur.
 * Sonuç : Bu sınıflar okuma ve yazma işlemleri karakterlei okunur ve karkaterler yazılır.
 */
/**
 * Not : Bu sınıf ile okuma işlemi yaptığımızda,Bu sınıftan nense olşturuken o bloğu try ve catch içersine
 * almamız gerekir.olmayan bir dosya ile çalışmak hata verebilir.
 */
public class File_Reader{
    public static void main(String[] args) {
            File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\file.txt");
            char[] veriler = new char[(int) f.length()];
            try{
                FileReader fr = new FileReader(f);
                fr.read(veriler);
                //dosyayı yazdırmak için 1.Yöntem
                String oku = new String(veriler);
                System.out.println(oku);
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("---------------");
            //dosyayı yazdırmak için 2.Yöntem
            for(int i = 0; i < ((int) f.length()); i ++){
                System.out.print(veriler[i]);
            }
    }
}