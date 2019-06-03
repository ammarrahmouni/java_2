import java.io.*;
/**
 * FileWriter : Bu sınıf ile dosya yazma işlemleri yapar.
 * yazma işleminde dizi oluşturma gerek yokttur.
 * kullanım şekli ve nesne oluşturulması aşağıdaki gibidir:
 * FileWriter f = new FileWriter("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\files1.txt", true);
 */
/**
 * Bu sınıfın yapıcısna ilk paramteresi üzerinde çalışacak dosaynın bilgisayrdaki adresidir.Diğer 
 * parmetrenin yazılma zorunluğu yoktur.Eğer true olarak yazılırsa o dosyadaki bilgilerin devamına
 * ekleme yapılır.Eğer yazılamsa dosyadaki verileri silenerek yazma işlemi gerçekleştirilir. 
 */
/**
 * Not : Dosyaya veri yazma işlemlerinde dosaynın kapatılmasına dikkat edilmelidir.Zorunluğu olamsa da 
 * hata ile karşılaşabiliriz.
 */
public class File_Writer{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\files1.txt");
        try{
            //Yazma işlemi
            FileWriter f1 = new FileWriter(f);
            String text = "My name is ammar and i am from syria";
            f1.write(text);
            //f1.write("My name is ammar and i am from syria"), //Doğru 
            f1.close(); // Çok önemli yazmasak istediğimiz sonuç alamyız.
            //Okuma işlemi
            char[] veriler = new char[(int) f.length()];
            FileReader f2 = new FileReader(f);
            f2.read(veriler);
            String oku = new String(veriler);
            System.out.println(oku);
            f2.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}