class Calisan{
    public String pozisyon = "calisan";
    public void calis(){

    }
}
class Mudur{
    public String pozisyon = "Mudur";
    public Mudur(){
        pozisyon = "Mudur";
    }
   
    public void calis(){
        System.out.println("Mudur calisiyor");
    }
}
class Programci{
    public String pozisyon = "Programci";
    public Programci(){
        pozisyon = "Progrmaci";
    }
   
    public void calis(){
        System.out.println("Programci calisiyor");
    }
}
class Pazarlamaci{
    public String pozisyon = "Pazarlamaci";
    public Pazarlamaci(){
        pozisyon = "Pazarlamaci";
    }
    
    public void calis(){
        System.out.println("Pazarlamaci calisiyor");
    }
}
public class Exirsice6{
    public static void mainBasla(Object [] o){
        for(int i = 0; i < o.length; i++)
        {
            if(o[i] instanceof Calisan)
            {
                Calisan c = (Calisan) o[i]; // aşağıya çevirim
                c.calis();
            }
            else if(o[i] instanceof Mudur)
            {
                Mudur m = (Mudur) o[i]; //aşağıya çevirim 
                m.calis();
            }
            else if(o[i] instanceof Programci)
            {
                Programci p = (Programci) o[i]; //aşağıya çevirim 
                p.calis();
            }
            else if(o[i] instanceof Pazarlamaci)
            {
                Pazarlamaci paz = (Pazarlamaci) o[i]; //aşağıya çevirim 
                paz.calis();
            }
        }
    }
    public static void main(String[] args){
        Object []o = new Object[4];
        o[0] = new Calisan();     //yukarı çevirim (upcasting)
        o[1] = new Programci();       //yukarı çevirim (upcasting)
        o[2] = new Pazarlamaci();   //yukarı çevirim (upcasting)
        o[3] = new Mudur(); //yukarı çevirim (upcasting)
        mainBasla(o);
    }
}