package algorithm;

import services.AsciiCount;

import java.util.Scanner;

public class Cipher {

    public String cipher(String textToEncrypt) {
        Scanner Scanner = new Scanner(System.in);
        StringBuilder cipher = new StringBuilder();

        int newCharToAddToCipher, shiftToApply, currentChar;

        int IntroduceManyNumberJumps = Scanner.nextInt();
        int NumberJumps = IntroduceManyNumberJumps % AsciiCount.ALPHABET_LENGTH;

        for (int i = 0; i < textToEncrypt.length(); i++) {
            currentChar = textToEncrypt.charAt(i);
            shiftToApply = AsciiCount.isOutOfAlphabet(currentChar, NumberJumps) ? NumberJumps - AsciiCount.ALPHABET_LENGTH : NumberJumps;
            newCharToAddToCipher = currentChar + shiftToApply;
            cipher.append((char) newCharToAddToCipher);
        }
        return cipher.toString();
    }

}
