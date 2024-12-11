import java.util.Scanner;


public class Cyptography {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter message to encrypt: ");
        String message = input.nextLine();
        System.out.print("enter key: ");
        int key = input.nextInt();
        String encrypted = encrypt(message, key);
        decrypt(encrypted, key);
    }
    
    
    public static String encrypt(String message, int key) {
            String encrypted = "";
            
            for (int index = 0; index < message.length(); index++) {
                char temp = message.charAt(index);
                encrypted += (temp += key);
            }
            
            System.out.println(encrypted);
            return encrypted;
    }
    
    
    public static void decrypt(String encrypted, int key) {
        String decrypted = "";
            
            for (int index = 0; index < encrypted.length(); index++) {
                char temp = encrypted.charAt(index);
                decrypted += (temp -= key);
            }
            
            System.out.println(decrypted);
        
    }
    
    
}
