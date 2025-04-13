package main;

public class EncryptionTest {
	
	public static void main(String[] args) {
        Encryptable secretMessage;

        // Using Secret with Caesar cipher
        secretMessage = new Secret("Code128");
        System.out.println("Original Secret: " + secretMessage);
        secretMessage.encrypt();
        System.out.println("Encrypted Secret: " + secretMessage);
        System.out.println("Decrypted Secret: " + secretMessage.decrypt());

        System.out.println();

        // Using Password with reverse encryption
        secretMessage = new Password("AllegaTor3!");
        System.out.println("Original Password: " + secretMessage);
        secretMessage.encrypt();
        System.out.println("Encrypted Password: " + secretMessage);
        System.out.println("Decrypted Password: " + secretMessage.decrypt());
    }
}

// Encryptable interface
interface Encryptable {
    void encrypt();
    String decrypt();
}

// Secret class using Caesar cipher
class Secret implements Encryptable {
    private String message;
    private int shift = 3;
    private boolean encrypted = false;

    public Secret(String msg) {
        message = msg;
    }

    public void encrypt() {
        if (!encrypted) {
            StringBuilder result = new StringBuilder();
            for (char c : message.toCharArray()) {
                result.append((char)(c + shift));
            }
            message = result.toString();
            encrypted = true;
        }
    }

    public String decrypt() {
        if (encrypted) {
            StringBuilder result = new StringBuilder();
            for (char c : message.toCharArray()) {
                result.append((char)(c - shift));
            }
            return result.toString();
        }
        return message;
    }

    public String toString() {
        return message;
    }
}

// Password class using string reversal
class Password implements Encryptable {
    private String password;
    private boolean encrypted = false;

    public Password(String password) {
        this.password = password;
    }

    public void encrypt() {
        if (!encrypted) {
            password = new StringBuilder(password).reverse().toString();
            encrypted = true;
        }
    }

    public String decrypt() {
        if (encrypted) {
            return new StringBuilder(password).reverse().toString();
        }
        return password;
    }

    public String toString() {
        return password;
    }
}


	

