/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Dhaval
 */
public class ClientTest {
    
    public ClientTest() {
        
    }
    
    public static void main(String [] args) {
      String serverName = "10.3.184.42";
      int port = 6606;
      try {
         System.out.println("Connecting to " + serverName + " on port " + port);
         Socket client = new Socket(serverName, port);
         
         System.out.println("Just connected to " + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         DataInputStream music = new DataInputStream(new FileInputStream("D:\\Songs\\Fairy Tail\\main.mp3"));
         int readBytes;
        //byte[] temp = new byte[1024];
           byte[] asd = music.toString().getBytes();
        /*while( (readBytes = music.read(temp, 0, temp.length)) != -1){
            out.write(temp, 0, readBytes);
        }*/
        //out.write(asd);
        
        
         //out.writeUTF("Hello from " + client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         BasicPlayerTest bpt = new BasicPlayerTest();
         
         int read;
        byte[] temp = new byte[1024];
        int i = 0;
        FileOutputStream outFile = new FileOutputStream("temp.mp3");
        
        while( (read = in.read(temp, 0, temp.length)) != -1){
            outFile.write(temp);
        }
        
        bpt.play("temp.mp3");
        
        System.out.println("asdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
             
        
        // System.out.println("Server says " + in.readUTF());
         client.close();
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
}
