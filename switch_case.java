public class switch_case {
    public static void main(String[] args){
        String day = "saturday";

        switch(day){
            case "tuesday", "wednesday", "sunday" -> System.out.println("off day");
            default -> System.out.println("On");
        }
    }
}
