public class JaggedArray
{
    public static void main(String[] args)
    {
        int arr[][] = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j] = (int)(Math.random() * 10);
                System.out.println(arr[i][j]);
            }
        }

        // for(int i=0; i<arr.length; i++)
        // {
        //     for(int j=0; j<arr[i].length; j++)
        //     {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int m[] : arr)  // for each loop
        {
            for(int j : m)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
