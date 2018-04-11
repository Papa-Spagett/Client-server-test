
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
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
public class Client {
     public static void main(String args[]) throws IOException{
         int number,temp;
        Scanner scan= new Scanner(System.in);
        Socket s = new Socket("131.118.66.187",58778); //Ip, Port
        Scanner scan1 = new Scanner(s.getInputStream());
        System.out.println("Please type a number: ");
        number = scan.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
                        p.println(number);
                        temp = scan1.nextInt();
                        System.out.println(temp);
}
}
