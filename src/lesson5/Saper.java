package lesson5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    public static void main(String[] args) {
        System.out.println("выберите уровень сложности: ");
        System.out.println("1 - новичек");
        System.out.println("2 - любитель");
        System.out.println("3 - профессионал");
        System.out.println("4 - особый");

        Scanner scanner = new Scanner(System.in);
        String lvl = scanner.nextLine();
        int[][] field = null;
        int needMines=0;
        if (lvl.equals("1") || lvl.equalsIgnoreCase("новичек")) {  // equalsIgnoreCase игнорирует учет регистра букв
            field = new int[9][9];
            while (needMines < 10); {
                SaperUtils.addMine(field,9,9);
                }
            }


            if (lvl.equals("2") || lvl.equalsIgnoreCase("любитель")) {
                field = new int[16][16];
                do{
                    int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                    int randomColIndex = ThreadLocalRandom.current().nextInt(16);
                    if (field[randomRowIndex][randomColIndex]!=-1){
                        field[randomRowIndex][randomColIndex]=-1;
                        needMines++;
                    }
                } while (needMines<40);
            }
            if (lvl.equals("3") || lvl.equalsIgnoreCase("профессионал")) {
                field = new int[16][30];
                do{
                    int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                    int randomColIndex = ThreadLocalRandom.current().nextInt(30);
                    if (field[randomRowIndex][randomColIndex]!=-1){
                        field[randomRowIndex][randomColIndex]=-1;
                        needMines++;
                    }
                } while (needMines<99);
            }
            if (lvl.equals("4") || lvl.equalsIgnoreCase("особый")) {
                System.out.println("Высота:");
                Scanner scanner1 = new Scanner(System.in);
                int x = scanner1.nextInt();
                System.out.println("Ширина:");
                Scanner scanner2 = new Scanner(System.in);
                int y = scanner2.nextInt();
                System.out.println("Количество мин:");
                Scanner scanner3 = new Scanner(System.in);
                int minesForSpecialLevel = scanner3.nextInt();
                field = new int[x][y];
                do{
                    int randomRowIndex = ThreadLocalRandom.current().nextInt(x);
                    int randomColIndex = ThreadLocalRandom.current().nextInt(y);
                    if (field[randomRowIndex][randomColIndex]!=-1){
                        field[randomRowIndex][randomColIndex]=-1;
                        needMines++;
                    }
                } while (needMines<minesForSpecialLevel);
            }

            //печатеам поле с минами
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == -1) {
                        System.out.print("X");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
        }
    }


