package com.company;

import java.util.*;
public class Main {



    public static void main(String[] args) {

        //Engineer's
        SalBand sal =new SalBand();


        Employee emp1 = new Engineer("Naheed", "Part-time", sal.engineerLevel1 );
        Employee emp2 = new Engineer("Dhanush", "Full-time", sal.engineerLevel3);
        Employee emp3 = new Engineer("Rajesh", "Full-time", sal.engineerLevel2 );



        //Manager's
        Employee emp4 = new Manager("Salma", "Full-time", sal.managerLevel2);
        Employee emp5 = new Manager("Amitabh", "Full-time", sal.managerLevel2);
        Employee emp6 = new Manager("Jitesh", "Part-time", sal.managerLevel3);

        ArrayList<Employee> employeeList= new ArrayList();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);

       //CTC

        int sum = 0;
        for(int i=0;i<employeeList.size();i++){
          sum=sum+employeeList.get(i).salaryBand;


        }
        System.out.println("The ctc of the company is:"+sum);

    }
}














