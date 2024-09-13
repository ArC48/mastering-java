package lecture1.examples;

public class SelectionStatements {

    public static void main(String[] args) {
        int age = 23;

        //if-else
        if (age < 18) {
            System.out.println("age is less than 18");
        } else if (age >= 18 && age < 30) {
            System.out.println("age is between 18 and 30");
        } else if (age >= 30 && age <40) {
            System.out.println("age is between 30 and 40");
        }  else {
            System.out.println("age is between 30 and 40");
        }

        //switch
        int i = 0;
        switch (i) {
            case 0:
                System.out.println("Variable is: 0");
                break;
            case 1:
                System.out.println("Variable is: 1");
                break;
            default:
                System.out.println("Variable is not equal to 0 or 1");
                break;
        }
    }
}
