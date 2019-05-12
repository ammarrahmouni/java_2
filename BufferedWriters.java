import java.io.*;
/**
 * BufferedWriter : writer sınıfınan türeyen bu sınıf karakter bazlı işlem yapar.Buffer kullandığı için
 * flush() metodu ile buffer içersinde bulunan verilerin dosyası yazdırılması gerekir.
 */
public class BufferedWriters{
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\copy2.txt");
        FileWriter fr = new FileWriter(f,false);
        BufferedWriter br = new BufferedWriter(fr);
        String text = "My name is ammar";
        br.write(text);
        br.flush();
        br.close();

    }
}
/**
 * FileWriter sınıfından bir nensne oluşturarak yapıcısına File sınıfından oluşturduğumuz nesneyi verdik
 *  yanın da false paramtersine ekledik çünkü içerdeki bilgileri silip yinden yazılmasını istiyoruz.
 * Bu paramterenin vermeysedik yine aynı işi yapardı.
 */