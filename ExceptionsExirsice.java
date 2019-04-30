import java.io.*;

class DiziErisim{
    public static void calis(){
        try{
            int sayilar[] = {1,2,3,4,5};
            for(int i = 0; i < 6; i++){
                System.out.println("--> " + sayilar[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("erorr : " + e);
        }
    }
    public static void main(String[] args) {
        System.out.println("Start");
        calis();
        System.out.println("End");
    }
}

class ReadFile{
    public static void cokCalis(){
        try{
            File f = new File("file.txt");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            System.out.println(bf.readLine());

            File fs = new File("ornek.txt");
            BufferedReader bfs = new BufferedReader(new FileReader(fs));
            System.out.println(bfs.readLine());
        }catch(IOException e){
            System.out.println("erorr : " + e);
        }
        System.out.println("cokcalis() yordami");

    }

    public static void calis(){
        cokCalis();
        System.out.println("Calis() yordami");
    }

    public static void main(String[] args) {
        calis();
        System.out.println("main() yordami");
    }
}

class ReadFile2{
    public static void cokCalis() throws IOException{
        File fs = new File("file.txt");
        BufferedReader bfs = new BufferedReader(new FileReader(fs));
        System.out.println(bfs.readLine());

        File f = new File("ornek.txt");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        System.out.println(bf.readLine());
    }
    public static void calis(){
        try{
            cokCalis();
            System.out.println("calis() yordami");
        }catch(IOException e){
            System.out.println("erorr: " + e);
        }
    }

    public static void main(String[] args) {
        calis();
        System.out.println("main() yordami");
    }
}
/**
 * cokCalis() yordami "throws IOException" diyerek kendisine çağıran yordamlara şöyle bir mesaj gönderir:
 * "Bakın benim içimde istisnaya yol açabilecek kod var ve eğer istisna oluşursa ben bunu fırlatırım bu 
 * yüzden başınız çaresine bakın."
 */

class ReadFile3{
    public static void cokCalis() throws IOException{
        File fs = new File("file.txt");
        BufferedReader bfs = new BufferedReader(new FileReader(fs));
        System.out.println(bfs.readLine());

        File f = new File("ornek.txt");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        System.out.println(bf.readLine());
    }

    public static void calis() throws IOException{
        cokCalis();
        System.out.println("calis() yordami");
    }

    public static void main(String[] args) {
        try{
            calis();
            System.out.println("main() yordami");
        }catch(IOException e){
            System.out.println("erorr: " + e);
        }

    }
}