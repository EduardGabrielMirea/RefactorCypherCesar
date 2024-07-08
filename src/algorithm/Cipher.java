package algorithm;
import static services.AsciiTest.*;

public class Cipher {


    public String cipher(String textToEncrypt,int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < textToEncrypt.length(); i++) {
            int currentChar = textToEncrypt.charAt(i);
            int shiftNumberInRenge = shift % alphabetLength;

            int shiftToApply;
            if (isOutOfAlphabet(currentChar, shiftNumberInRenge)) {
                shiftToApply = shiftNumberInRenge - alphabetLength;
            } else {
                shiftToApply = shiftNumberInRenge;
            }
            int newCipherCharAdd = currentChar + shiftToApply;
            encryptedText.append((char) newCipherCharAdd);
        }
        return encryptedText.toString();
    }

}
