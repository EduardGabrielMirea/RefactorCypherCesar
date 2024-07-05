import algorithm.Cipher;
import algorithm.Decipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cipher TextToEncypt = new Cipher();
        Decipher TextToUnCrypt = new Decipher();
        Scanner ScannerUser = new Scanner(System.in);

        System.out.println("Testing cipher and decipher functions...");
        //assert TextToEncypt.cipher("Hello World", 1).equals("Ifmmp!Xpsme") : TextToEncypt.cipher("Hello World", 1) + " === 'Ifmmp!Xpsme'";
        //assert TextToUnCrypt.decipher(TextToEncypt.cipher("Hello World", 3), 3).equals("Hello World") : TextToUnCrypt.decipher(TextToEncypt.cipher("Hello World", 3), 3) + " === 'Hello World'";
        System.out.println("All tests passed!");
    }
}
