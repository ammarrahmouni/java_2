import java.io.*;
/**
 * FileOutputStream : ile veriler dosya yazdırmanın FileWriter sınıfından bir farkı byte tabanlı olduğu için 
 * dosayay veri yazdırmak için bir byte dizisi oluşturmalıdır.
 * Sonuç : yani burda karakterler yazmak yerine karakterlein bytler yazılır.
 */
/**
 * Burda dikkat edelim yazma işlemi bir byte tipi bir dizi oluşturduk ve bu dizi text'in karakterlerin byte 
 * olarak çevirdik ve kaydettik dizide.burda write metodu hemen bir text gönderemeyiz.çünkü burda write metodu
 * sadece byte alır,yani karakterlerin byte'ye çevirir ardığından yazılır.
 */
public class FileOutputStreams{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\file3.txt");
        try{
            //Yazma işlemi
            FileOutputStream fo = new FileOutputStream(f);
            String text = "In descriptive writing, the author does not just tell the reader what was seen, felt, tested, smelled, or heard.";
            byte veriler[] = text.getBytes();
            fo.write(veriler);
            //fo.write("sda"); //Hata burda karakterler gönderemeyiz.
            fo.close();
            //Okuma işlemi
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