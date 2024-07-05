package repository;

import services.AsciiCount;

public interface IAsciiCount {

    boolean isUpperCaseLetterOutOfRange();

    boolean isLowerCaseOutOfRange();

    boolean isOutOfAlphabet();
}
