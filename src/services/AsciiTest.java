package services;

public class AsciiTest {
    public static final int alphabetLength = 26;
    public static final int AsciiUpperCaseA = 65;
    public static final int AsciiUpperCaseZ = 90;
    public static final int AsciiLowerCaseA = 97;
    public static final int AsciiLowerCaseZ = 122;

    private static boolean isUpperCase(int charAsciiValue) {
        return charAsciiValue >= AsciiUpperCaseA && charAsciiValue <= AsciiUpperCaseZ;
    }

    private static boolean isLowerCase(int charAsciiValue) {
        return charAsciiValue >= AsciiLowerCaseA && charAsciiValue <= AsciiLowerCaseZ;
    }

    private static boolean isUpperCaseOutOfRange(int charAsciiValue, int shift) {
        return isUpperCase(charAsciiValue) && (charAsciiValue + shift > AsciiUpperCaseA || charAsciiValue + shift < AsciiUpperCaseA);
    }

    private static boolean isLowerCaseOutOfRange(int charAsciiValue, int shift) {
        return isLowerCase(charAsciiValue) && (charAsciiValue + shift > AsciiLowerCaseZ || charAsciiValue + shift < AsciiLowerCaseA);
    }

    public static boolean isOutOfAlphabet(int charAsciiValue, int shift) {
        return isUpperCaseOutOfRange(charAsciiValue, shift) || isLowerCaseOutOfRange(charAsciiValue, shift);
    }
}
