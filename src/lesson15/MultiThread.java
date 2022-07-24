package lesson15;

//МНОГОПОТОЧНОСТЬ:
public class MultiThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() { //АНОНИМНЫЙ КЛАСС
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("задание мыть посуду выполнено на " + i + " %");
                    System.out.println("задание пылесосить выполнено на " + i + " %");
                    System.out.println("задание мыть полы выполнено на " + i + " %");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() { //АНОНИМНЫЙ КЛАСС
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("задание пылесосить выполнено на " + i + " %");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() { //АНОНИМНЫЙ КЛАСС
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("задание мыть полы выполнено на " + i + " %");
                }
            }
        });
//        Thread thread1 = new Thread(new MyRunnableClass("Мыть посуду"));
//        Thread thread2 = new Thread(new MyRunnableClass("Пылесосить"));
//        Thread thread3= new Thread(new MyRunnableClass("Мыть полы"));
//        MyThread thread1 = new MyThread("мыть посуду");
//        MyThread thread2 = new MyThread("пылесосить");
//        MyThread thread3 = new MyThread("мыть полы");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread extends Thread { //наследование для многопоточности
    String task; //Название задачи

    public MyThread(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("задание " + task + " выполнено на " + i + " %");
        }
    }
}

class MyRunnadleClass implements Runnable {
    String task; //Название задачи


    public MyRunnadleClass(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("задание " + task + " выполнено на " + i + " %");
        }
    }
}
