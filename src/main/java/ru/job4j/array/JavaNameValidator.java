package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (!name.isEmpty() && !(Character.isDigit(name.charAt(0))) && !(Character.isUpperCase(name.charAt(0)))) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isSpecialSymbol(code)
                        || isUpperLatinLetter(code)
                        || isLowerLatinLetter(code)
                        || Character.isDigit(code)) {
                    valid = true;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return 65 <= code && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return 97 <= code && code <= 122;
    }
}