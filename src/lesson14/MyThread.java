package lesson14;

public class MyThread extends Thread{
    String ip;
    int port;

    public MyThread(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
    @Override
    public void run() {
        Main.checkProxy(ip, port);
    }

}
