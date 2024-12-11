import java.util.Scanner;


public class Cryptography {
    
    
    public String encrypt(String message, int key) {
            String encrypted = "";
            
            for (int index = 0; index < message.length(); index++) {
                char temp = message.charAt(index);
                encrypted += (temp += key);
            }
            
            System.out.println(encrypted);
            return encrypted;
    }
    
    
    public String decrypt(String encrypted, int key) {
        String decrypted = "";
            
            for (int index = 0; index < encrypted.length(); index++) {
                char temp = encrypted.charAt(index);
                decrypted += (temp -= key);
            }
            
            System.out.println(decrypted);
            return decrypted;
    }
    
    
}
