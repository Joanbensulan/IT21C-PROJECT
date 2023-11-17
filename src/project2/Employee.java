package project2;

import java.time.LocalDate;

public class Employee {
    String empName;
    int empSalary;
    LocalDate empDate;
    
    Employee (String empName,int empSalary,  LocalDate empDate){
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDate = empDate;
    }
    String getempName(){
        return empName;
    }
    int getempSalary(){
        return empSalary;
    }
    LocalDate empDate(){
        return empDate;
    }
}