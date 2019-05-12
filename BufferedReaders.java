import java.io.*;
/**
 * BufferedReader : Reader sınıftan türyen bu sınıf karakter tabanlı işlem yapar.Dosyadan okuma işlemleri
 * buffer kullanılarak yapıları ve performası fazladır.
 */
public class BufferedReaders{
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\copy.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String satir = br.readLine();
            while(satir != null){
                    System.out.println(satir);
                    satir = br.readLine();
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/**
 * BufferedReader aynı zamanda kullanıcıdan veri girişine de izin verir.Bu sınıf kullanarak klavyeden girilen 
 * değeri alabiliriz.Bunula ilgili de bir örnek yapalim
 */
class BufferedReaderr{
    public static void main(String[] args) {
        try{
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(is);
            System.out.println("Birşeyler yazınız : ");
            String deger = bf.readLine();
            System.out.println("Girilen : " + deger);
            bf.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/**
 * Kullanıcıdan veri almak içine yine readLine() metodu kullandık bu metot girilen input boşluklarda beraber alır.
 * BufferedReader sınıfı veri girişi kullanılacağı zaman InputStreamReader sınıf ile bereaber kullanılır.
 */