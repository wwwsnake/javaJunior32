package lesson14;

//проверка рабочих прокси-серверов. программа отправляет запрос по айпи и порту, если ответ есть, то рабочий
//ДЗ: рабочие ip в отдельный файл, реализовать checkProxy  2 остальными способами мнгопоточность
import java.io.*;
import java.net.*;

public class Main {
    /*//    public static void main(String[] args) {
    //        String text = "Hello, World!";
    //        try {
    //            FileOutputStream fos = new FileOutputStream("C://Java/text.txt");
    //            byte[] buffer = text.getBytes();
    //            fos.write(buffer,0,buffer.length);
    //            System.out.println("файл прочитан");
    //        } catch (Exception e) {
    //            e.printStackTrace();
    //        }
    //
    //    }*/
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C://Java/ip.txt");
            int i;
            String result = "";
            while ((i = fin.read()) != -1) { //-1 это пустое место в конце файла (как последний индекс)
                if (i == 13) {
                    continue; //перейти на следующий круг
                } else if (i == 10) {
                    String ip = result.split(":")[0];
                    int port = Integer.parseInt(result.split(":")[1]);
                    Thread thread = new Thread((new Runnable() { //многопоточность через анонимные классы
                        @Override
                        public void run() {
                            checkProxy(ip, port);
                        }
                    }));
                    thread.start();
                    result = "";
                } else if (i == 9) { //9 это пробел в байт-коде. в переменную до нее сохраняется айпишник, после порт через : (таблица ascii)

                    result += ":";
                } else {
                    result += (char) i;
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkProxy(String ip, int port) {
        //ДЗ: читаем файл, сохраняем в новый через 1 строку
        try {
            FileInputStream fin = new FileInputStream("C://Java/ip.txt");
            FileOutputStream fos = new FileOutputStream("C://Java/sortedIP.txt");
            String result = "";
            int i;
            int count = 0;
            while ((i = fin.read()) != -1) {
                if (i == 13) {
                    count++;
                    if (count % 2 == 0) {
                        byte[] buffer = result.getBytes();
                        fos.write(buffer, 0, buffer.length);
                    } else {
                        result = "";
                    }
                } else {
                    result += (char) i;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Request to server " + ip + ":" + port);
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("http://vozhzhaev.ru/test.php");
            URLConnection connection = url.openConnection(proxy);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream())); //чтение ответа от сервера
            System.out.println("ip " + ip + " port " + port + " - работает!");
            System.out.println();
        } catch (Exception e) {
            System.out.println("ip " + ip + " port " + port + " - не работает!");
            System.out.println();
        }
    }
}