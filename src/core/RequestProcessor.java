package core;

import java.net.Socket;

public class RequestProcessor(Socket client) throws IOException{
    this.client=client;
}
 public void processRequest() throws IOException{
    request=new HttpRequestParser(client.getInputStream()).parseRequest();

    switch(request.getRequesttype()){
        case GET:
            break;

        case POST:
        break;

        case PUT:
        break;

        case DELETE:
        break;

        }
        }