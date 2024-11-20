import java.util.Scanner;

public class Palindromic {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        char newWord = 'a';
        String duplicate = "";
        
        System.out.print("input: ");
        String word = input.nextLine();
        
        for (int index = 0; index < word.length(); index++) {
            newWord = word.charAt(index);
            char character = word.charAt(index + (1 - index));
            if (newWord == character) {
                duplicate += newWord;
            }
        }
        
        System.out.println(duplicate);
    }
}
