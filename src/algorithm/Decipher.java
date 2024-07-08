package algorithm;

import static services.AsciiTest.alphabetLength;
import static services.AsciiTest.isOutOfAlphabet;

public class Decipher {

    public String decipher(String textToUncrypt, int shift) {
        StringBuilder decipherText = new StringBuilder();

        for (int i = 0; i < textToUncrypt.length(); i++) {
            int currentChar = textToUncrypt.charAt(i);
            int shiftNumberInRenge = -shift % alphabetLength;

            int shiftToApply;
            if (isOutOfAlphabet(currentChar, shiftNumberInRenge)) {
                shiftToApply = shiftNumberInRenge + alphabetLength;
            } else {
                shiftToApply = shiftNumberInRenge;
            }

            int newCharToAddToDecipher = currentChar + shiftToApply;
            decipherText.append((char) newCharToAddToDecipher);
        }
        return decipherText.toString();
    }

}
