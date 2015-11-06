package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        String[] names = new String[15];
        int[] numbers = new int[30];
        int i, s, s2;
        String str;
        RandomNameGenerator rnd = new RandomNameGenerator();
        for (i = 0; i < 15; i++) {
            names[i] = rnd.next();
        }
        Arrays.sort(names);
        for (i = 0; i < 15; i++) {
            System.out.println("Hello, " + names[i]);
        }
        //Отображение приветствия от 3-го имени до 5-го.
        System.out.println("Отображение приветствия от 3-го имени до 5-го");
        for (i = 2; i < 5; i++) {
            System.out.println("Hello, " + names[i]);
        }
        //Изменение регистра
        for (i = 0; i < 15; i++) {
            names[i] = names[i].toUpperCase();
            System.out.println(names[i]);
        }
        //Заполение числового массива
        s = 0;
        for (i = 0; i < 30; i++) {
            numbers[i] = (int) (Math.random() * 201 - 100);
            System.out.println(numbers[i]);
            if ((numbers[i] % 2 == 0) && (numbers[i] != 0)) {
                s++;
            }
        }
        System.out.println("Количество четных чисел: " + s);
        //Строковая переменная
        str = "НИКОЛЬ";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (i = 0; i < 6; i++) {
            System.out.println(charArray[i]);
        }
        //Количество гласных
        s = 0;
        s2 = 0;
        for (i = 0; i < 6; i++) {
            if (charArray[i] == 'И') {
                s++;
            }
            ;
            if (charArray[i] == 'О') {
                s2++;
            }
            ;
        }
        System.out.println("Количество букв И:" + s);
        System.out.println("Количество букв О:" + s2);

    }
}
