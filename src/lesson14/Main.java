package lesson14;

//проверка рабочих прокси-серверов. программа отправляет запрос по айпи и порту, если ответ есть, то рабочий

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
                if (i == 13) {//9 это пробел в байт-коде. в переменную до нее сохраняется айпишник, после порт через : (таблица аскии)
                    continue; //перейти на следующий круг
                } else if (i == 10) {
                    String ip = result.split(":")[0];
                    int port = Integer.parseInt(result.split(":")[1]);
                    checkProxy(ip, port);
                    result = "";
                } else if (i == 9) {

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
        //ДЗ: тут написать чтобы каждый 2 айпишник и порт сохранялись в отдельный файл

        System.out.println("Request to server " + ip + ":" + port);
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("http://vozhzhaev.ru/test.php");
            URLConnection conection = url.openConnection(proxy);
            BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream())); //чтение ответа от сервера
            System.out.println("ip " + ip + " port: " + port + " - ok!");
            System.out.println();
        } catch (Exception e) {
            System.out.println("ip " + ip + " port: " + port + " - not ok!");
            System.out.println();
        }
    }
}