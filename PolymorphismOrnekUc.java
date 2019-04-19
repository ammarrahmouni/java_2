class Calisan{
    public String pozisyon = "calisan";
    public void calis(){

    }
}
class Mudur extends Calisan{
    public String pozisyon = "Mudur";
    public Mudur(){
        pozisyon = "Mudur";
    }
    @Override
    public void calis(){
        System.out.println("Mudur calisiyor");
    }
}
class Programci extends Calisan{
    public String pozisyon = "Programci";
    public Programci(){
        pozisyon = "Progrmaci";
    }
    @Override
    public void calis(){
        System.out.println("Programci calisiyor");
    }
}
class Pazarlamaci extends Calisan{
    public String pozisyon = "Pazarlamaci";
    public Pazarlamaci(){
        pozisyon = "Pazarlamaci";
    }
    @Override
    public void calis(){
        System.out.println("Pazarlamaci calisiyor");
    }
}
public class PolymorphismOrnekUc{
    //Ekrana yazdır
    public static void mainBasla(Calisan [] c){
        for(int i = 0; i < c.length; i++)
        {
            c[i].calis(); //Dikkat
        }
    }
    public static void main(String[] args){
        Calisan [] c = new Calisan[4];
        c[0] = new Calisan();     //yukarı çevirim grekmiyor
        c[1] = new Programci();       //yukarı çevirim (upcasting)
        c[2] = new Pazarlamaci();   //yukarı çevirim (upcasting)
        c[3] = new Mudur(); //yukarı çevirim (upcasting)
        mainBasla(c);
    }
}