package lecture4.examples.generics;

public class GenericsExample {

    public static void main(String[] args) {
        //Generic class
        Pair<Integer> pair = new Pair<>(1, 2);
        Pair<String> pairString = new Pair<>("hello", "world");

        String[] words = {"Mary", "had", "a", "little", "lamb"};
        System.out.println(GenericArrayAlg.minMax(words));

        System.out.println();

        //Generic method
        String middleWord = GenericArrayAlg.<String>getMiddle(words);
        middleWord = GenericArrayAlg.getMiddle(words);
        System.out.println("Middle value of array: " + middleWord);
    }
}
