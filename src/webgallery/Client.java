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
public class Client extends Person {
    private String payway;

    public Client(String payway, String name, String lastname) {
        super(name, lastname);
        this.payway = payway;
    }

    public String getPayway() {
        return payway;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    
}
