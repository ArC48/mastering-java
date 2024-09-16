package lecture1.exercises;

public class FindMaxOccurrenceOfCharacter {

    public static void main(String[] args) {
        String word = "Pneumonoultramicroscopicsilicovolcanoconiosis";
        char target = 'P';

        //Find count of occurrence of target character
        int occurence = 0;
        for (char character: word.toCharArray()) {
            if (character == target) {
                occurence++;
            }
        }

        System.out.println(occurence);
        
    }
}
