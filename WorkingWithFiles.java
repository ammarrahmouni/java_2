import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

/**
 * The java.io package includes a File class that allows you to work with files.
 * To start, create a File object and specify the path of the file in the constructor.
 */
/**
 * The Scanner class inherits from the Iterator class, so it behaves like one.
 * We can use the Scanner object's next() method to read the file's contents.
 * It is always good practice to close a file when finished working with it. 
 * One way to do this is to use the Scanner's close() method.
 */
/**
 * ilk şey o dosayayı açıyoruz File class'inda bir object oluşturmak yardım ile 
 * ve File class'in constructor metodu o dosyanın path'yi gönderiyorz.Ardığından
 * Scanner class'inda bir objcet oluşturyoruz ve Scanner contsructor method File'in 
 * object'i gönderiyoruz.Sanner class'i iterator class'indan türevlendiği için 
 * hasNext(), next() ve nextLine() metohd'lar yardım ile ordaki dosyayı okuyabiliriz.
 */

public class WorkingWithFiles{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\Tweet.java");
        if(file.exists()){
            System.out.println(file.getName() + " exists!");
        }
        else
            System.out.println("The file dose not exist");

        try {
            File x = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\Java_API.txt");
            Scanner sc = new Scanner(x);      
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Erorr");
        }
    }
}
/**
 * The file's contents are output word by word, because the next() method returns each word separately.
 * But nextLine() output is normal
 */
/**
 * We surrounded the code with a try/catch block, because there's a chance that the file may not exist.
 * The getName() method returns the name of the file.
 * Note that we used double backslashes in the path, as one backslash should be escaped in the path String.
 */
