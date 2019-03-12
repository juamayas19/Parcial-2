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
public abstract class Person {
    protected String name;
    protected String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    
}
