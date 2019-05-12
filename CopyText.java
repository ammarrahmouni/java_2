import java.io.*;
public class CopyText{
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\copy.txt");
        File f2 = new File("C:\\Users\\AMMAR RAHMOUNI\\Desktop\\java_2\\copy1.txt");
        try{
            FileReader fr = new FileReader(f1);
            char[] veriler = new char[(int) f1.length()];
            fr.read(veriler);
            String oku = new String(veriler);
            fr.close();
            FileWriter fw = new FileWriter(f2);
            fw.write(oku);
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}