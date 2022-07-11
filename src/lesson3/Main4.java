package lesson3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        /**
         * Нам пользователь задал пароль
         * нужно напечатать на консоль этот пароль подходит или нет
         * Пароль подходит если:
         * он содержит более 8 символов,
         * содержит хотябы 1 цифру
         * содержит большую букву
         */
        System.out.println("enter password");
        Scanner scanner = new Scanner(System.in);
        String inputFromUser = scanner.nextLine();
        char charsFromPassword[] = inputFromUser.toCharArray();
        if (charsFromPassword.length < 8) {
            System.out.println("пароль короткий");
            return;
        }
        int countNumbers = 0;
        for (int i = 0; i < charsFromPassword.length; i++) {
            if (charsFromPassword[i] == '1' ||
                    charsFromPassword[i] == '2' ||
                    charsFromPassword[i] == '3' ||
                    charsFromPassword[i] == '4' ||
                    charsFromPassword[i] == '5' ||
                    charsFromPassword[i] == '6' ||
                    charsFromPassword[i] == '7' ||
                    charsFromPassword[i] == '8' ||
                    charsFromPassword[i] == '9') {
                countNumbers++;
            }
        }
        if (countNumbers == 0) {
            System.out.println("в пароле нет чисел");
        }

        int counter = 0;
        for (char x : charsFromPassword) {
            if (Character.isUpperCase(x)) {
                counter++;
            }
        }
        if (counter==0){
            System.out.println("нужна большая буква");
        }
    }
}
