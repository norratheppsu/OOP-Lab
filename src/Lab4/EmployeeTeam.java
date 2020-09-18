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
public class EmployeeTeam {
    private Employee boss;
    private Employee employee;
    
    public EmployeeTeam(Employee b, Employee e) {
        boss = b;
        employee = e;
    }
    
    public void printEmployeeDetails() {
        System.out.println(employee.getFirstname()+" "+employee.getLastname()+" "+employee.getMonthlySalary());
    }
    public void printAllEmployeeDetails() {
        System.out.println(boss.getFirstname()+" "+boss.getLastname()+" "+boss.getMonthlySalary());
        System.out.println(employee.getFirstname()+" "+employee.getLastname()+" "+employee.getMonthlySalary());
    }
    
    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if(boss.getFirstname().equals(firstname)) {
            boss.setMonthlySalary(newSalary);
        }
        if(employee.getFirstname().equals(firstname)) {
            employee.setMonthlySalary(newSalary);
        }
    }
    
    public void giveRaiseToAllEmployee() {
        boss.raise10();
        employee.raise10();
    }
    
    public void printLowYearlySalary(double yearlySalary) {
        if(boss.getYearlySalary() < yearlySalary) {
            System.out.println(boss.getFirstname()+" "+boss.getLastname());
        }
        
        if(employee.getYearlySalary() < yearlySalary) {
            System.out.println(employee.getFirstname()+" "+employee.getLastname());
        }
    }
    
    
}
