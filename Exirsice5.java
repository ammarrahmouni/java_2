class OperatingSystem{
    private String name;
    private String verision;
    public OperatingSystem()
    {
        this.name = "None";
        this.verision = "None";
    }
    public OperatingSystem(String name , String verision)
    {
        this.name = name;
        this.verision = verision;
    }
    public void printOsInfo()
    {
        System.out.println("OS : " + this.name + " verision : " + this.verision);
    }
}
class Windows extends OperatingSystem{
    public Windows()
    {
        super("Windows" , "UnKnown");
    }
    public Windows(String verision)
    {
        super("Windows" , verision);
    }
}
class Mac extends OperatingSystem{
    public Mac()
    {
        super("Mac" , "UnKnown");
    }
    public Mac(String verision)
    {
        super("Mac", verision);
    }
}
class Linux extends OperatingSystem{
    private String dist;
    public Linux()
    {
        super("Linux" , "UnKnown");
    }
    public Linux(String verision, String dist)
    {
        super("Linux" , verision);
        this.dist = dist;
    }
    @Override
    public void printOsInfo()
    {
        super.printOsInfo(); //ana class'ta metodu çağırdık ilavetten bu cümleyi yazdık
        System.out.println("Dist : " + this.dist);
    }
}
public class Exirsice5{
    public static void printOs(OperatingSystem a)
    {
        a.printOsInfo();
    }
    public static void main(String[] args){
        Windows win = new Windows("7");
        Mac mc = new Mac("lion");
        Linux lin = new Linux("Fodera", "10.1");
        win.printOsInfo();
        mc.printOsInfo();
        lin.printOsInfo();
        System.out.println("--------------------");
        printOs(win); //Polymorphism
        printOs(mc);  //Polymorphism
        printOs(lin); //Polymorphism
    }

}