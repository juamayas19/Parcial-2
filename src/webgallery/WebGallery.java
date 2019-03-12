/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juamayas
 */
public class WebGallery {


    public static void main(String[] args) {
        ArrayList<Artist> artists = new ArrayList();
        ArrayList<Client> clients = new ArrayList();
    }
    public static ArrayList readRegister(ArrayList<Artist> artists, ArrayList<Client> clients)throws FileNotFoundException{
       
        String name=null;
        String lastname=null;
        
        Scanner read = new Scanner(new File("Register.txt"));
        read.useDelimiter(":");
        while(read.hasNextLine()){
        if (read.hasNext()) {
            if (read.next().equals("Artista")) {   
            String curriculum=null;
            String distinciones=null;
            String description=null;
            String style = null;
            double price= 0;
            String picname= null;
            int numObras=0;
            read.next(name);
            read.next(lastname);
            read.next(curriculum);
            read.next(distinciones);
            Artist art= new Artist(curriculum, distinciones, name, lastname);
        
            read.nextLine();
            read.nextInt(numObras);
            for (int i = 0; i < numObras; i++) {        
            read.hasNextLine();
            read.next(picname);
            read.next(description);
            read.next(style);
            price=read.nextDouble();
            art.getObras().add(new Pictures(picname,description,style, price));
            }
        
        return artists;
        }
           
        
        else if(read.next().equals("Comprador")){
            if (read.hasNext()) {
            if (read.next().equals("Comprador")) {   
            String payway="PSE";
            read.next(name);
            read.next(lastname);
            Client client = new Client(payway, name, lastname);
            clients.add(client);
            return clients;
        }
        }
        
    }

}
}
        return null;
}
    public static double sumTotalObras(ArrayList<Artist>artists){
        double counter=0;
        for (int i = 0; i < artists.size(); i++) {
            counter+=artists.get(i).sumObras();
        }
        return counter;
    }
}
