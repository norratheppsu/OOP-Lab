/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author super
 */
public class Person {
    
    protected String firstName;
    protected String lastName;
    
    // Optional: if you dont supply any constructor,
    // Java will insert a default constructor like the one below
    // Commenting out this constructor will still result in the same code
    //public Person() {
    //    
    //}
    
    public void setFirstName(String f) {
        firstName = f;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String l) {
        lastName = l;
    }
    
    public String getLastName() {
        return lastName;
    }
    
}
