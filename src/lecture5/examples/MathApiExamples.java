package lecture5.examples;

public class MathApiExamples {

    public static void main(String[] args) {
        Integer x = 5;
        double max = Math.max(5.1, x);
        int min = Math.min(5, 7);

        System.out.println("max: " + max);
        System.out.println("min: " + min);

        int roundedNumber = Math.round(125.6F);

        System.out.println("Rounded number: " + roundedNumber);

        double num = Math.random();
        System.out.println("Random number: " + num);


    }
}
