/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author super
 */
public abstract class PSUStudent {
    
    protected int age;
    protected double gpa;
    
    public PSUStudent(int a, double g) {
        age = a;
        gpa = g;
    }
    
    public void setAge(int a) {
        age = a;
    }
    
    public int getAge() {
        return age;
    }
    
    public abstract double getGrade();
    
}
