public class type_conversion {
    public static void main(String a[]){
        int b = 3;
        byte c = 127;

        b = (byte) c;  //type conversion or casting

        System.out.println(b);


        //type promotion
        
        byte x = 10;
        byte y = 30;

        int result = x * y;
        System.out.println(result);
    }
}