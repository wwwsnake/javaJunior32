package lesson2;

/**
 * есть ценка у ученика. нужно выяснить отлично или хорошо или не очень или плохо или это не оценка
 */
public class Main2 {
    public static void main(String[] args) {

        int mark = 5;

        if (mark == 5){
            System.out.println("ОТЛИЧНО!");
        }else if (mark == 4){
            System.out.println("ХОРОШО!");
        }else if (mark == 3){
            System.out.println("НЕ ОЧЕНЬ!");
        }else if (mark == 2){
            System.out.println("ПЛОХО!");
        }else {
            System.out.println("Это НЕ ОЦЕНКА!");
        }
    }
}
