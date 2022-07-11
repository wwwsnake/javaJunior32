package lesson8;

import java.util.Scanner;

public class PrintUtils {

    public static void printQuestion(Question question) {
        System.out.println(question.getQuestion());
        Option[] options = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            if (options[i] != null) {
                System.out.println("  " + (i + 1) + " - " + options[i].getOption());
            }
        }
    }

    public static int[] getAnswers() {
        System.out.println("ведите варианты ответов через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String inputAnswer = scanner.nextLine();
        String[] nums = inputAnswer.split(" ");
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(nums[i]);

        }
        return result;
    }
}
