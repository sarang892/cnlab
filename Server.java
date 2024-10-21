import java.io.*;
import java.util.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("Establishing Connection");
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            System.out.println("Connection done Sucessfully");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String op = (String) dis.read();
            System.out.println("Output: " + op);
            ss.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}