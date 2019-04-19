package access;

public class object1{

    public int speed;
    private int x;
    protected int y;

    // طرق من اجل وضع قيم للمتغير الخاص خارج الكلاس 
    public int getx()
    {
        return x;
    }
    public void setx(int f)
    {
        x = f;
    }

    // طرق من اجل وضع قيم للمتغير الخاص خارج الكلاس 

    // constructure function
    public object1(int s)
    {
        this.speed = s;
    }
    // constructure function

    public int get_speed()
    {
        return this.speed;
    }

    protected void Arrays(int a)
    {
        System.out.println(a);
    }

}