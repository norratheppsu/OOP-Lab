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
public class EmployeeTest {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Mic", "Doe", 10);
        System.out.println(e1.getFirstname()+" "+e1.getLastname()+" "+e1.getMonthlySalary());
        e1.setFirstname("John");
        e1.setLastname("Johnson");
        e1.setMonthlySalary(100);
        System.out.println(e1.getFirstname()+" "+e1.getLastname()+" "+e1.getMonthlySalary());
        Employee e2 = new Employee("Pat", "Voo", 101);
        System.out.println(e1.getYearlySalary());
        System.out.println(e2.getYearlySalary());
        e1.raise10();
        e2.raise10();
        System.out.println(e1.getYearlySalary());
        System.out.println(e2.getYearlySalary());
    }
}
