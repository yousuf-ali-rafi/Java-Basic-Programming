class Computer
{
    public void playmusic()
    {
        System.out.println("Play Music...");
    }

    public String getMyPen(int cost)
    {
        if(cost >= 12)
            return "Pen";
        else
            return "Nothing";
        // return "Pen";
    }
}


public class Methods
{   
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.getMyPen(12);
        System.out.println(str);
    }
}
