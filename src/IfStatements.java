public class IfStatements {
    public static void main(String[] args) throws Exception{
        // if-else
        int age = 23;

        if(age > 18) {
            System.out.println("You can buy a beer!");
        } else if (age == 18) {
            System.out.println("Let me Check!");
        } else {
            System.out.println("Get tf out of here!");
        }



        // Switch

        String name = "Beqa";
        switch(name) {
            case "Beqa":
                System.out.println("u got the coolest name");
                break;
            case "Luka":
                System.out.println("Meehh");
                break;
            default:
                System.out.println("Change your name asap!");            
            }
    }
}
