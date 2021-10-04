package com.company;

public class Main {

    public static void main(String[] args) {

        //Engineer's
        Engineer e1 = new Engineer();
    Engineer e2 = new Engineer();
    Engineer e3 = new Engineer();

    e1.name="Ramesh";
    e1.empType="Part-time";
    e1.SalaryBand= e1.level1;

    e2.name="Rohini";
    e2.empType="Full-time";
    e2.SalaryBand= e2.level1;

    e3.name="Naheed";
    e3.empType="Full-time";
    e3.SalaryBand= e3.level3;

    System.out.println("First Engineer's name:"+e1.name);
    System.out.println("First Engineer's employee type:"+e1.empType);
    System.out.println("First Engineer's SalaryBand:"+e1.SalaryBand);

    System.out.println("Second Engineer's Name:"+e2.name);
    System.out.println("Second Engineer's employee type:"+e2.empType);
    System.out.println("Second Engineers Salary:"+e2.SalaryBand);

    System.out.println("Third Engineer's name:"+e3.name);
    System.out.println("Third Engineer's employee type:"+e3.empType);
    System.out.println("Third Engineer's Salary:"+e3.SalaryBand);

    //Manager's
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();

        m1.name="Pooja";
        m1.empType="Part-time";
        m1.SalaryBand= m1.level1;

        m2.name="Amrish";
        m2.empType="Full-time";
        m2.SalaryBand= m2.level2;

        m3.name="Dolly";
        m3.empType="Full-time";
        m3.SalaryBand= m3.level2;

        System.out.println("First Manager's name:"+m1.name);
        System.out.println("First Manager's employee type:"+m1.empType);
        System.out.println("First Manager's SalaryBand:"+m1.SalaryBand);

        System.out.println("Second Manager's Name:"+m2.name);
        System.out.println("Second Manager's employee type:"+m2.empType);
        System.out.println("Second Managers Salary:"+m2.SalaryBand);

        System.out.println("Third Manager's name:"+m3.name);
        System.out.println("Third Manager's employee type:"+m3.empType);
        System.out.println("Third Manager's Salary:"+m3.SalaryBand);

        //CTC
        float ctc = e1.SalaryBand+ e2.SalaryBand+ e3.SalaryBand+ m1.SalaryBand+ m2.SalaryBand+ m3.SalaryBand;
        System.out.println("The CTC of the company is:"+ctc);

    }
}
