package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 11; i++) {
            sendRequest();
        }
    }
    public static Scanner scanner = new Scanner(System.in);
    private static void sendRequest() throws IOException {
        Socket socket = new Socket("127.0.0.1", 25225);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String sb = scanner.nextLine();

        bw.write(sb);
        bw.newLine();
        bw.flush();

        String answer = br.readLine();
        System.out.println("Client got string: " + answer);

        br.close();
        bw.close();

    }
}
