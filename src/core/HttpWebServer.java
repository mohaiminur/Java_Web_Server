package core;

import java.io.IOException;
import java.net.Socket;
public static final int DEFAULT_PORT=6789;
private ServerSocket httpServer;
public class HttpWebServer (int port) throws IOException{

this.httpServer = new ServerSocket(port);
}



    public void waitForClint() throws IOException{
        System.out.println("Serving HTTP on %d\n",httpServer.getInetAddress().getHostName(),httpServer.getLocalPost());

        while(true){
            Socket socket = httpServer.accept();
            System.out.println("Received a client");

            RequestProcessor processor=new RequestProcessor(socket);
            processor.processrequest();

            process.disconnect();


            System.out.println("Clint disconnected");
        }










}
