public class pre_post_increment{
    public static void main(String args[]){
        int a = 5;

        //post increment
        int result = a++;
        System.out.println("Post increment: " + result);

        System.out.println("Now a is: " + a);

        // pre increment
        result = ++a;
        System.out.println("Pre increment: " + result);
    }
}