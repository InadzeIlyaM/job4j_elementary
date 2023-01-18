package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (post[post.length - 1] != word[word.length - 1]) {
            result = false;
            }
        if (post[post.length - 2] != word[word.length - 2]) {
            result = false;
        }
        return result;
    }
}

