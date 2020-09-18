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
public class EmployeeTeamTest {
    
    public static void main(String[] args) {
        Employee boss = new Employee("Boss", "Bossy", 1000);
        Employee employee = new Employee("Employee", "Emp", 100);
        
        EmployeeTeam team = new EmployeeTeam(boss, employee);
        team.printEmployeeDetails();
        team.printAllEmployeeDetails();
        team.updateSalaryOfEmployee("Boss", 2999);
        team.printAllEmployeeDetails();
        team.printLowYearlySalary(1000);
        team.giveRaiseToAllEmployee();
        team.printAllEmployeeDetails();
        
    }
}
