public class Operators {
    public static void main(String[] args) throws Exception {
        // Arithmetic operators
        int num1 = 51;
        int num2 = 10;
        // int sum = num1 + num2;

        int sum = Math.addExact(num1, num2);
        int sub = Math.subtractExact(num1, num2); 
        int multiply = Math.multiplyExact(num1, num2);
        int division = Math.divideExact(num1, num2);
        int modulo = num1 % num2;

        // System.out.println("Sum: " + sum); // +
        // System.out.println("Subtraction: " + sub); // - 
        // System.out.println("Multiply: " + multiply); // *
        // System.out.println("Division: " + division); // /
        // System.out.println("Modulo: " + modulo); // %

        //  increment
        
        int increment = 5;
        // increment = increment + 1;
        // increment += 1;
        // increment++;
        // ++increment;
        
        //  increment 5 and print it - prints 6
        // System.out.println(++increment);

        // print 5 and then increment it - prints 5
        // System.out.println(increment++);


        // Logical Operators
        int a = 4;
        int b = 5;

        boolean andOperator = a > b && b > 1;
        boolean orOperator = a > b || b > 1;
        System.out.println(andOperator);
        System.out.println(orOperator);

    }
}
