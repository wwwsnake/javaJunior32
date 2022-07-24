package lesson14;

public class MyRunnableClass implements Runnable {
    String ip;
    int port;

    public MyRunnableClass(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        Main.checkProxy(ip, port);
    }

}
