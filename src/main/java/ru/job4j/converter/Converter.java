package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float euroRuble = Converter.euroToRuble(5);
        float dollarRuble = Converter.dollarToRuble(6);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println("5 euro are " + euroRuble + " rubles.");
        System.out.println("6 dollar are " + dollarRuble + " rubles.");
        float inRuToEuro = 140;
        float expectedRuToEuro = 2;
        float outRuToEuro = Converter.rubleToEuro(inRuToEuro);
        boolean passedRuToEuro = expectedRuToEuro == outRuToEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedRuToEuro);
        float inRuToDollar = 120;
        float expectedRuToDollar = 2;
        float outRuToDollar = Converter.rubleToDollar(inRuToDollar);
        boolean passedRuToDollar = expectedRuToDollar == outRuToDollar;
        System.out.println("120 rubles are 2 dollar. Test result : " + passedRuToDollar);
        float inEuroToRuble = 2;
        float expectedEuroToRuble = 140;
        float outEuroToRuble = Converter.euroToRuble(inEuroToRuble);
        boolean passedEuroToRuble = expectedEuroToRuble == outEuroToRuble;
        System.out.println("2 euro are 140 rubles . Test result : " + passedEuroToRuble);
        float inDollarToRuble = 2;
        float expectedDollarToRuble = 140;
        float outDollarToRuble = Converter.dollarToRuble(inDollarToRuble);
        boolean passedDollarToRuble = expectedDollarToRuble == outDollarToRuble;
        System.out.println("2 dollar are 120 rubles . Test result : " + passedDollarToRuble);
    }
}
