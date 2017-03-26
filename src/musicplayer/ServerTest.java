/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.net.*;
import java.io.*;

/**
 *
 * @author Dhaval
 */
public class ServerTest extends Thread {
    
    
    private ServerSocket serverSocket;
   
    public ServerTest(int port) throws IOException {
       serverSocket = new ServerSocket(port);
       serverSocket.setSoTimeout(100000);
    }

   public void run() {
      while(true) {
         try {
            System.out.println("Waiting for client on port " + 
               serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            
            System.out.println("Just connected to " + server.getRemoteSocketAddress());
            DataInputStream in = new DataInputStream(server.getInputStream());
            /*int read;
            byte[] temp = new byte[1024];
            int i = 0;
            while( (read = in.read(temp, 0, temp.length)) != -1){
                System.out.println(++i);
            }*/
            //System.out.println(in.readUTF());
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            /*out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
               + "\nGoodbye!");*/
            DataInputStream music = new DataInputStream(new FileInputStream("D:\\Songs\\Fairy Tail\\main.mp3"));
            int readBytes;
            byte[] temp = new byte[1024];
            //byte[] asd = music.toString().getBytes();
            while( (readBytes = music.read(temp, 0, temp.length)) != -1){
                out.write(temp, 0, readBytes);
            }
            //out.write(asd);
            server.close();
            
         }catch(SocketTimeoutException s) {
            System.out.println("Socket timed out!");
            break;
         }catch(IOException e) {
            e.printStackTrace();
            break;
         }
      }
   }
   
   public static void main(String [] args) {
      int port = 6606;
      try {
         Thread t = new ServerTest(port);
         t.start();
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
}
