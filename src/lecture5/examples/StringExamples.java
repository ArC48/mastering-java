package lecture5.examples;

public class StringExamples {

    public static void main(String[] args) {
        //Strings are immutable
        String testString = "Immutable " + "String";
        String testString2 = "Immutable String";

        System.out.println(testString == testString2);

        System.out.println(testString.substring(0, 9));
        System.out.println(testString);

        testString = testString.substring(0, 9);
        System.out.println(testString);
        System.out.println();

        //Concatenation
        System.out.println("3" + 3);
        System.out.println();

        //length()
        System.out.println("length(): " + testString.length());
        System.out.println();

        //charAt()
        System.out.println("charAt() index 3: " + testString.charAt(3));
        System.out.println();

        //indexOf()
        System.out.println("indexOf(char ch): " + testString.indexOf('m'));
        System.out.println("indexOf(char ch, int from): " + testString.indexOf('m', 2));
        System.out.println("indexOf(String str): " + testString.indexOf("mm"));
        System.out.println();

        //substring()
        System.out.println("substring() " + testString.substring(0, 4));
        System.out.println();

        //toLowerCase() and toUpperCase()
        System.out.println("toUpperCase(): " + testString.toUpperCase());
        System.out.println("toLowerCase(): " + testString.toLowerCase());
        System.out.println(testString);
    }
}
