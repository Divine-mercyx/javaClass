import java.util.Scanner;
import java.util.HashSet;

public class Duplicate {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        HashSet<Character> seenCharacters = new HashSet<>();
        String duplicate = "";
        
        
        System.out.print("enter a string: ");
        String word = input.nextLine();
        
        //String[] letter = new String[word.length];
        
        for (int index = 0; index< word.length(); index++) {
            char characters = word.charAt(index);
            if (!seenCharacters.contains(characters)) {
                seenCharacters.add(characters);
                result.append(characters);
            }
        }
        
        System.out.println(result.length());
    }       
}
