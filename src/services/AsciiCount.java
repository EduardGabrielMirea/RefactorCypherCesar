package services;

import repository.IAsciiCount;

public class AsciiCount {

    public static final int ALPHABET_LENGTH = 26;
    public static final int LETTER_A_UPPER = 65;
    public static final int LETTER_Z_UPPER = 90;
    public static final int LETTER_A_LOWER = 97;
    public static final int LETTER_Z_LOWER = 122;


    public static boolean isUpperCaseLetterOutOfRange(int charCode, int shift) {
        return charCode >= LETTER_A_UPPER && charCode <= LETTER_Z_UPPER && (charCode + shift > LETTER_Z_UPPER || charCode - shift < LETTER_A_UPPER);
    }

    public static boolean isLowerCaseOutOfRange(int charCode, int shift) {
        return charCode >= LETTER_A_LOWER && charCode <= LETTER_Z_LOWER && (charCode + shift > LETTER_Z_LOWER || charCode - shift < LETTER_A_LOWER);
    }

    public static boolean isOutOfAlphabet(int charCode, int shift) {
        return isUpperCaseLetterOutOfRange(charCode, shift) || isLowerCaseOutOfRange(charCode, shift);
    }
}
