/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Oak
 */
public class Employee {
    private String firstname;
    private String lastname;
    private double monthlySalary;
    
    public Employee(String f, String l, double m) {
        firstname = f;
        lastname = l;
        monthlySalary = m;
    }
    
    public Employee(String f, String l) {
        this(f, l, 0);
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public double getMonthlySalary() {
        return monthlySalary;
    }
    
    public void setFirstname(String f) {
        firstname = f;
    }
    
    public void setLastname(String l) {
        lastname = l;
    }
    
    public void setMonthlySalary(double m) {
        monthlySalary = m;
    }
    
    public double getYearlySalary() {
        return monthlySalary*12;
    }
    
    public void raise10() {
        monthlySalary = 1.1*monthlySalary;
    }
}
