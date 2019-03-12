/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.ArrayList;

/**
 *
 * @author juamayas
 */
public class Artist extends Person{
    private String curriculum;
    private String distinciones;
    private ArrayList<Pictures> obras;

    public Artist(String curriculum, String distinciones, String name, String lastname) {
        super(name, lastname);
        this.curriculum = curriculum;
        this.distinciones = distinciones;
        this.obras= new ArrayList();
    }

    public String getCurriculum() {
        return curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public ArrayList<Pictures> getObras() {
        return obras;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    
    public double sumObras(){
        double counter=0;
        for (int i = 0; i <this.obras.size() ; i++) {
            counter+=this.obras.get(i).getPrice();
            
        }
        return counter;
    }
    
    
}
