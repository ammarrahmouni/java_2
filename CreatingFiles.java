import java.util.Formatter;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * Creating Files
 * Formatter, another useful class in the java.util package, is used to create content and write it to files.
 */
/**
 * Writing to Files
 * Once the file is created, you can write content to it using the same Formatter object's format() method.
 */
/**
 * Önmeli Not : Bir file oluşturduğumuzda ve onu hemen okumak istiyorsak 
 * çok dikkat etmeliyiz önce bu dosayı kapatıp ardığından onu Scanner class ile okuyabailiriz.
 * Bunun nednei eğer biz onu kapatmadan önce okumak istiyorsak bu dosayı boş olduğundan dolayı okuyamayız
 * çünkü biz değer bir dosayayı onun üzerinde yazdıktan sonra kapatamsak yzdığımız şeyi kaydetilemz.
 * o yüzdeen bu konudan çok dikkatli olmalıyız
 * Not2 : o dosayayı scanner class ile okunurken scanner ve ondan türetilen object kesinlikle
 * bir try ve catch blokların içinde olmalıdır.Nedeni kontroll etmek için bu dosya olup olmadığın
 * eğer bu dosya yoksa o zaman bir exception üretilir. 
 */
public class CreatingFiles{
    public static void main(String[] args) {
        //creat a file
        try{
            Formatter f = new Formatter("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\file.txt");
            f.format("%s%s", "Hello", " World!\r\n");           
            f.close();
            File x = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\file.txt");
            Scanner read = new Scanner(x);
            while (read.hasNext()) {
                System.out.println(read.nextLine());
            }
            read.close();
        }catch(FileNotFoundException e){
            System.out.println("Erorr!");
        }
        //Read a file    
    }
}
/**
 * This creates an empty file at the specified path. If the file already exists, this will overwrite it.
 * Again, you need to surround the code with a try/catch block, as the operation can fail.
 */