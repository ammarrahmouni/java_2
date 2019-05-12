import java.io.*;
/**
 * FileInputStream : Bu sınıf ile dosya okuma byte bzlı olarak yapılır.Byte bazlı okumalrda 
 * karakter encoding olmaz.Byte bazlı işlemlerde okunan veriler byte tipinde bir diziye aktarılır.
 * okuma işlemleri byte bazlı olanlarda bu şekilde yapılır.Bu sınıf kuulanabilmek için ilk olarak
 * bu sınıftan bir nensne oluştururuz.Daha sonra bu nesneye,okunacak File nesnesi paramtere olarak verilir. 
 * Sonuç : Yani bu tü okuma karakterlerin okunma yerine o karakterlerin bellekteki bytelerine okur.
 */
/**
 * Not : Bu sınıf kullanabilmek için import java.io.FileInputStream; ifadesi ile bu sınıf import etmemiz gerekir.
 */
/**
 * Not : Bu sınıf ile okuma işlemi yaptığımızda,Bu sınıftan nense olşturuken o bloğu try ve catch içersine
 * almamız gerekir.olmayan bir dosya ile çalışmak hata verebilir.
 */
public class FileInputStreams{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\file.txt");
        try{
            FileInputStream fs = new FileInputStream(f);
            byte dizi[] = new byte[(int) f.length()];
            fs.read(dizi);
            String oku = new String(dizi);
            System.out.println(oku);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}