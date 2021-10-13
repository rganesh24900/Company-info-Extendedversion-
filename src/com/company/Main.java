package com.company;

import java.util.*;
public class Main {



    public static void main(String[] args) {

        //Engineer's
        SalBand sal =new SalBand();


        Engineer emp1 = new Engineer("Naheed", "Part-time", sal.engineerLevel1 );
        Engineer emp2 = new Engineer("Dhanush", "Full-time", sal.engineerLevel3);
        Engineer emp3 = new Engineer("Rajesh", "Full-time", sal.engineerLevel2 );



        //Manager's
        Manager emp4 = new Manager("Salma", "Full-time", sal.managerLevel2);
        Manager emp5 = new Manager("Amitabh", "Full-time", sal.managerLevel2);
        Manager emp6 = new Manager("Jitesh", "Part-time", sal.managerLevel3);

        ArrayList<Object> employeeList= new ArrayList();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);

       //CTC
        ArrayList<Integer> salaryArray = new ArrayList();
        salaryArray.add(emp1.salaryBand);
        salaryArray.add(emp2.salaryBand);
        salaryArray.add(emp3.salaryBand);
        salaryArray.add(emp4.salaryBand);
        salaryArray.add(emp5.salaryBand);
        salaryArray.add(emp6.salaryBand);
        int sum = 0;
        for(int i=0;i<salaryArray.size();i++){
          sum=sum+salaryArray.get(i);


        }
        System.out.println("The ctc of the company is:"+sum);

    }
}














