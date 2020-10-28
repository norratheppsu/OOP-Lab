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
public class Parent extends Person {
    
    protected Child child;
    protected int money;
    
    public Parent(int m) {
        money = m;
    }
    
    public Child getChild() {
        return child;
    }
    
    public void setChild(Child c) {
        child = c;
    }
    
    @Override
    public void setFirstName(String f) {
        firstName = "Parent";
    }
}
