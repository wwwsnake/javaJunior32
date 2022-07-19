package lesson14.DZ;
//домашка 14 урока в отдельном файле
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
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
    }
}
