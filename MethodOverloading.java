class Calculate
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}


public class MethodOverloading
{
    public static void main(String a[])
    {
        Calculate obj = new Calculate();
        int result = obj.add(4, 3);

        System.out.println(result);
    }
}
