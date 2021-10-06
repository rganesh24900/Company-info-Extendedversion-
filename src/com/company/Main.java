package com.company;
import java.util.*;
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

        System.out.println("Engineer1's Information:");
    List<String> eng1 = new ArrayList<String>();
    eng1.add(e1.name);
    eng1.add(e1.empType);
    eng1.add(String.valueOf(e1.SalaryBand));


     for (String i :eng1){

         System.out.println(i);
     }
        System.out.println("Engineer2's Information:");
     List<String> eng2 = new ArrayList<String>();
        eng2.add(e2.name);
        eng2.add(e2.empType);
        eng2.add(String.valueOf(e2.SalaryBand));

        for (String j : eng2){

            System.out.println(j);
        }
        System.out.println("Engineer3's Information:");
     List<String> eng3 = new ArrayList<String>();
        eng3.add(e3.name);
        eng3.add(e3.empType);
        eng3.add(String.valueOf(e3.SalaryBand));

        for (String k : eng3){

            System.out.println(k);
        }



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

        System.out.println("Manager1's Information:");
        List<String> man1 = new ArrayList<String>();
        man1.add(m1.name);
        man1.add(m1.empType);
        man1.add(String.valueOf(m1.SalaryBand));


        for (String a :man1){

            System.out.println(a);
        }
        System.out.println("Manager2's Information:");
        List<String> man2 = new ArrayList<String>();
        man2.add(m2.name);
        man2.add(m2.empType);
        man2.add(String.valueOf(m2.SalaryBand));

        for (String b : man2){

            System.out.println(b);
        }
        System.out.println("Manager3's Information:");
        List<String> man3 = new ArrayList<String>();
        man3.add(m3.name);
        man3.add(m3.empType);
        man3.add(String.valueOf(m3.SalaryBand));

        for (String c : man3){

            System.out.println(c);
        }
        //CTC
        float ctc = e1.SalaryBand+ e2.SalaryBand+ e3.SalaryBand+ m1.SalaryBand+ m2.SalaryBand+ m3.SalaryBand;
        System.out.println("The CTC of the company is:"+ctc);

    }
}
