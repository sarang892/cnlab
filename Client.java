import java.io.*;
import java.util.*;
import java.net.*;


public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Enter two numbers");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            String s = String.valueOf(c);
            Socket socket = new Socket("localhost" , 6666);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.write("Addition:" +s);
            dos.flush();
            dos.close();
            socket.close();
        }
        catch(Exception e) {
            System.out.println("An error occured:" + e.getMessage());
        }
    }
}
