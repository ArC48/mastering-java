public class App {
    public static void main(String[] args) throws Exception {
        // Whole Numbers (integers) primitive types
        byte b = 127;
        short sh = 32_123; // _ doesn't change anything just makes reading easier
        int i = 23_434_084;
        long l = 32423534534643L; // needs L at the end
        // System.out.println(b);
        // System.out.println(sh);
        // System.out.println(i);
        // System.out.println(l);


        // String
        String text = "Hello World, I'm Beqa";
        // System.out.println(text);


        // Arrays
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        // System.out.println(numbers[0]);
        
        // initialize with variables
        int[] numbers2 = new int[] {-10,11,12};
        System.out.println(numbers2[0]);
        
    }
}
