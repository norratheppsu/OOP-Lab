/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Oak
 */
public class PersonTest {
    public static void main(String[]args ) {
        Person per = new Child(10,100,100);
        per.setFirstName("John");
        System.out.println(per.getFirstName());  
        // Error below
        // Person g = per.getGuardian(); 
        
        // Error below
        // Parent par1 = new Person(); 
        Parent par3 = new Parent(0);
        // Error below
        // par3.setChild(per); 
        Child child = new Child(10,100,100);
        par3.setChild(child);
        
        Child c = par3.getChild();
        
        Person per2 = par3.getChild(); 
        Person per3 = c.getGuardian();
        // Error below
        // Person per4 = per2.getGuardian();
        
        Person per5 = c;
        
    }
}
