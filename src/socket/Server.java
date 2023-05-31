package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        try (ServerSocket socket = new ServerSocket(25225)) {

            System.out.println("Server is started.");
            while (true) {
                Socket client = socket.accept();
                handleRequest(client);
            }
        }
    }

    public static Scanner scanner = new Scanner(System.in);
    private static void handleRequest(Socket client) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

        String str = br.readLine();
        System.out.println("Server got string: " + str);

        String answer = scanner.nextLine();
        bw.write(answer);
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();

        client.close();
    }
}
