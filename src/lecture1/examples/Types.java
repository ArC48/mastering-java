package lecture1.examples;


public class Types {

    public static void main(String[] args) {
        // Variable declaration: type var-name = value;

        //Primitive types

        //Whole number primitive types
        byte b = 127;
        short sh = 32767;
        int i = 2147483647;
        long l = 264849421484L;

        //Real numbers
        float f = 250.89f;
        double d = 864984.842;

        //boolean values. shorthand variable declaration
        boolean truthy = true, falsy = false;

        //Character
        char ch = 'A';

        //Reference Types

        //String
        String text = "Hello world";

        //arrays
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 9;

        //Initialize with variables
        int[] numbers2 = new int[] {5, 4, 15, -100};
    }
}
