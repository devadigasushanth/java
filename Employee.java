/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Acer
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Employeesal employee=new Employeesal(1,"Vishal",5000);
         Employeesal employee1=new Employeesal(10,"rohan",10000);
        System.out.println("initail employee details:");
        employee.EmployeeDetails();
        employee.raiseSalary(10);
        System.out.println("employee details after raise salary:");
        employee.EmployeeDetails();
        System.out.println("initail employee details:");
        employee1.EmployeeDetails();
        employee1.raiseSalary(10);
        System.out.println("employee details after raise salary:");
        employee1.EmployeeDetails();
    }
    
}

        // TODO code application logic here
    

