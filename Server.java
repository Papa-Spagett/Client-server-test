import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Big Thomas
 */
public class Server {
      public static void main(String args[]) throws IOException{
          int number,temp;
        
          ServerSocket server = new ServerSocket(58778);
          Socket s1 = server.accept();
        Scanner scan= new Scanner(s1.getInputStream());
       number = scan.nextInt();
        
       temp = number/32;
        PrintStream p =new PrintStream(s1.getOutputStream());
        p.println(temp);
    
}
}
