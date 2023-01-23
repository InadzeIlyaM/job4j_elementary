package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || (Character.isDigit(name.charAt(0))) || Character.isUpperCase(name.charAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isNotSpecialSymbol(code)
                    && isNotUpperLatinLetter(code)
                    && isNotLowerLatinLetter(code)
                    && !Character.isDigit(code)) {
                valid = false;
                break;
            }
        }

        return valid;
    }

    public static boolean isNotSpecialSymbol(int code) {
        return code != 36 && code != 95;
    }

    public static boolean isNotUpperLatinLetter(int code) {
        return 65 > code || code > 90;
    }

    public static boolean isNotLowerLatinLetter(int code) {
        return 97 > code || code > 122;
    }
}