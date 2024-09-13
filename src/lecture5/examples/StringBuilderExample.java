package lecture5.examples;

public class StringBuilderExample {

    public static void main(String[] args) {
        String alpha = new String();
        for(char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);

        StringBuilder betta = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++) {
            betta.append(current);
        }
        String result = alpha.toString();
        System.out.println(result);
    }
}
