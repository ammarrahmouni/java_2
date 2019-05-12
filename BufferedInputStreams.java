import java.io.*;
/**
 * BufferedInputStream : Bu sınıf bir soyut sınıf olan FilterInputStream sınıfndan türetilmiştir.
 * Bu sınıfın adından şunu anlıyoruz.Buffer kullanarak veri aktarma yapar ve aynı zamanda byte tabanlı 
 * iletim sağlar.Buffer kullandığı için performans avantajı vardır.
 * Byte tabanlı işlem yapıldığı için okuma işleminde bir byte dizisi oluşturmalı ve çekilern 
 * elemanlar bu diziye alınmalıdır.Bu sınıf FileInputStream sınıfı ile beraber kullanırız.Bu sınıfı 
 * oluşturduğumuz nesneyi BufferedInputStream sınıfın yapıcısına göndeririz.
 */
public class BufferedInputStreams{
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\copy.txt");
            byte dizi[] = new byte[(int) f.length()];
            FileInputStream f2 = new FileInputStream(f);
            BufferedInputStream bf = new BufferedInputStream(f2);
            int okunan = 0;
            while( (okunan = bf.read(dizi)) != -1){
                String veriler = new String(dizi,0,okunan);
                System.out.println(veriler);
            }
            bf.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}