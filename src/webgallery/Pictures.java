/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author juamayas
 */
public class Pictures {
    private String nombre;
    private String description;
    private String style;
    private double price;

    public Pictures(String nombre, String description, String style, double price) {
        this.nombre = nombre;
        this.description = description;
        this.style = style;
        this.price = price;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescription() {
        return description;
    }

    public String getStyle() {
        return style;
    }

    public double getPrice() {
        return price;
    }
    
}
