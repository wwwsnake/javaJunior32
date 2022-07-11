package lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * написать программу которая будет работать 10 лет если ее не остановить
         * а когда мы ее остановим, она выдаст сколько времени работала
         */

        for (int year = 0; year < 10; year++) {
            for (int monts = 0; monts < 12; monts++) {
                for (int day = 0; day < 30; day++) {
                    for (int hours = 0; hours < 24; hours++) {
                        for (int min = 0; min < 60; min++) {
                            for (int sec = 0; sec < 60; sec++) {
                                System.out.printf("От старта прошло: %d год, %d месяца, %d дня, %d часов, %d минуты, %d секунд \n", year, monts, day, hours, min, sec);
                                // вместо %d будут подставлены значения переменных
                                Thread.sleep(1000); //пауза на 1 секунду
                            }
                        }
                    }
                }
            }
        }
    }

}
