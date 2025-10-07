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
public class Employeesal {
    private int id;
    private String name;
    private double salary;
    public Employeesal(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void raiseSalary(double percent){
        if(percent>0){
            double raiseAmount=salary*(percent/100);
            salary+=raiseAmount;
            System.out.println(name+"'s salary raised by"+percent+"%\nNewssalary:$"+salary);
        }
        else{
            System.out.println("invalid percentage.salary remains unchanged");
        }
    }
    public void EmployeeDetails(){
        System.out.println("employee ID:"+id+"\nname:"+name+"\nsalary:$"+salary);
    }
    }
    
