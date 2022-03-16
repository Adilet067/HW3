package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(adilet(10, 20));
        System.out.println(adilet(15, 23));
        System.out.println(adilet(17, 28));
        System.out.println(adilet(19, 25));
        System.out.println(adilet(13, 29));


    }

    public static String adilet(int age, int temperature) {
        String result = "";
        if (age <= 20 && age >= 45 && temperature >= -20 && temperature <= 30) {
            result = "Можно идти гулять";

        } else if (age < 20 && temperature > 0 && temperature < 28) {
            result = "Можно идти гулять";

        } else if (age < 45 && temperature > -10 && temperature <= 25) {
            result = "Оставайтесь дома";
        }
        return result;
    }
}
