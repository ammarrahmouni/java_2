import java.io.*;
import java.util.Scanner;
/**
 * Scanner sınıfı,kullancıdan veri alma görevi gördüğü gibi bir dosyayı okuyup ekrana yazdırabilir.
 * önceki konularda Scanner sınıfı ile klavyeden veri girişi yaparken (System.in) parametresi 
 * kullanmıştık.Scanner sınıfı,bu girilen parametreye göre farklı işler yapılır.Şimdi bu 
 * parametreyi diğştirerek dosyadaki bilgileri yazdırmayı çalışalım. 
 */
public class FileScanner{
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\files1.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String veri = sc.nextLine();
                System.out.println(veri);
            }
        }catch(FileNotFoundException e){
            System.out.println("Dosya bağlanırken hata oluştu");
        }
    }
}