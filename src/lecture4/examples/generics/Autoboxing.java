package lecture4.examples.generics;

public class Autoboxing {

    public static void main(String[] args) {
        int a = 5;
        Integer b = Integer.valueOf(a);
        int c = b.intValue();

        b = a;
        c = b;

        //Unboxing null
        Integer d = null;
        int e = d;
    }
}
