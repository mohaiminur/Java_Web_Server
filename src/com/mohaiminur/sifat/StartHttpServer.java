package com.mohaiminur.sifat;

import core.HttpWebServer;

public class StartHttpServer {

    public static void main(String[] args) {
	// write your code here
        if (args.length ==1){


            int port=Integer.parseInt(args[0]);

            HttpWebServer webServer=new HttpWebServer(port);

            webServer.waitForClint();
        }
        else{
            System.out.println("Usage: java StartHttpServer <port>");
        }
    }
}
