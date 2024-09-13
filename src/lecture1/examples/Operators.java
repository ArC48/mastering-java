package lecture1.examples;

public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int sum = 5 + 10;
        System.out.println("sum= " + sum);

        int sub = 20 - 10;
        System.out.println("sub=" + sub);

        int mul = 3 * 4;
        System.out.println("mul=" + mul);

        int div = 20 / 10;
        System.out.println("div=" + div);

        int mod = 15 % 10;
        System.out.println("mod=" + mod);

        int increment = 5;
        increment++;
        System.out.println("increment=" + ++increment);

        int decrement = 5;
        decrement--;
        System.out.println("decrement=" + --decrement);

        int shortHandOperations = 10;
        shortHandOperations += 5;
        System.out.println(shortHandOperations);

        //Relational operators
        int a = 5;
        int b = 9;
        boolean equal = a == b;
        boolean notEqual = a != b;
        boolean moreThan = a > b;
        boolean moreThanOrEqual = a >= b;
        boolean lessThan = a < b;
        boolean lessThanOrEqual = a <= b;

        System.out.println("equal=" + equal);
        System.out.println("notEqual=" + notEqual);
        System.out.println("moreThan=" + moreThan);
        System.out.println("moreThanOrEqual=" + moreThanOrEqual);
        System.out.println("lessThan=" + lessThan);
        System.out.println("lessThanOrEqual=" + lessThanOrEqual);

        //Logical Operators
        int c = 10;
        int d = 50;

        boolean and = a > b && c < d;
        boolean or = a >= b || c != d;

        System.out.println("and result=" + and);
        System.out.println("or result=" + or);
    }
}
