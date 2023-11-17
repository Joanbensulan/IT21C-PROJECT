package project2;

import java.time.LocalDate;

public class Main{
    public static void main (String [] args){
        Employee Employee1 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        Employee Employee2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
        Employee Employee3 = new Employee("Magdalena Artrmon", 50000, LocalDate.parse("2011-04-15"));
        
        System.out.println(Employee1.empName + " " +Employee1.empSalary + " "+ Employee1.empDate());
        System.out.println(Employee2.empName + " " +Employee2.empSalary + " "+ Employee2.empDate());
        System.out.println(Employee3.empName + " " +Employee3.empSalary + " "+ Employee3.empDate());
    }
    
    
}