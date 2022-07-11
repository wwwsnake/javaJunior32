package lesson3;

import java.util.Arrays;

/**
 * Есть массив цифр (задайте его сами). Вывести на консоль:
 * 1) Сколько в массиве четных цифр?
 * 2) Все числа с массива, которые больше 10, но меньше 25.
 * 3) Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трем.
 * 4) ***Только те числа, которые содержат в себе символ 4 (не для всех)
 */

public class lesson3DZ {
    public static void main(String[] args) {

        int[] mass = {2, 45, 7, 2, 444, 8, 3, 2, 49, 33, 22, 55, 3, 22, 78, 4, 24};

        //1)
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("1) четных чисел: " + count);

        //2)
        System.out.print("2) ");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 10 && mass[i] < 25) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println("");
        //3)
        System.out.print("3) ");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
            if (mass[i] % 3 == 0) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println();
        //4)
        System.out.print("4) ");
        String stringMass = Arrays.toString(mass);
        String ar[] = stringMass.substring(1, stringMass.length() - 1).split(", ");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].contains("4")) {
                System.out.print(ar[i] + " ");
            }
        }


    }
}


