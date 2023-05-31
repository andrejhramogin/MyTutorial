package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class clientSocket {
    public static void main(String[] args) throws IOException {
        simpleSocket();
    }


    public static void simpleSocket() throws IOException {
        Socket socket = new Socket("java-course.ru", 80);

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        String command = "GET /sitemap.xml HTTP/1.1\r\nHost:java-course.ru\r\n\r\n";
        os.write(command.getBytes());
        os.flush();

        int c;
        while ((c = is.read()) != -1) {
            System.out.print((char) c);
        }
        socket.close();
    }

}
