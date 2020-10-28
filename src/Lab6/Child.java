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
public class Child extends Person {
    
    protected Person guardian;
    protected int age;
    protected int height;
    protected double weight;
    
    public Child(int a, int h, double w) {
        age = a;
        height = h;
        weight = w;
    }
    
    public void setGuardian(Person g) {
        guardian = g;
    }
    
    public Person getGuardian() {
        return guardian;
    }
    
    @Override
    public void setFirstName(String f) {
        firstName = "Child";
    }
}
