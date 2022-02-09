package web.server;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Date;

public class httpResponse {
    PrintWriter out = null;
    OutputStream dataOut = null;
    String fileRequested = null;
    int fileLength = 0;
    String content = null;
    File file = null;

    private void response(PrintWriter out, OutputStream dataOut, String fileRequested, int httpCode, int fileLength, byte[] fileData, String content, File file) throws IOException{
        if(httpCode == 200){
            //status code 200: va tutto bene
            out.println("HTTP/1.1 200 OK"); 
        }else if(httpCode == 301){
            //status code 301:la risposta viene spostata
            out.println("HTTP/1.1 301 REINDIRIZZATO"); 
        }else if(httpCode == 404){
            //status code 404: FILE NON TROVATO il file non viene trovato
            out.println("HTTP/1.1 404 File Not Found"); 
        }else if(httpCode == 501){
            //status code con 501: errore nel server
            out.println("HTTP/1.1 501 Not Implemented"); 
        }

        out.println("Server: Java HTTP Server from SSaurel : 1.0");
		//out.println("Date: " + new Date());
		out.println("Location: " + fileRequested);
		out.println("Content-type: " + content);
		out.println("Content-length: " + fileLength);
        //viene usato il doppio spazio per far capire che stiamo passando all'header
		out.println(); 
        // flush character output stream buffer
		out.flush(); 
		
		dataOut.write(fileData, 0, fileLength);
		dataOut.flush();
    }
    
}
