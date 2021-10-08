package com.company;
import java.lang.reflect.Method;
import java.util.*;
public class Main {

    private static Class<Engineer> engineerClass;

    public static void main(String[] args) {

        //Engineer's
        SalBand sal = new SalBand();

        Engineer e1 = new Engineer("Naheed", "Part-time", sal.engineerLevel1);
        Engineer e2 = new Engineer("Dhanush", "Full-time", sal.engineerLevel3);
        Engineer e3 = new Engineer("Rajesh", "Full-time",sal.engineerLevel2);


       Object[] engArray={e1,e2,e3};

        List<Object> eng = new ArrayList<Object>();

        for(int i=0;i<engArray.length;i++){
            eng.add(engArray[i]);
        }


        for (int j = 0; j < eng.size(); j++) {
            System.out.println(eng.get(j));
        }


        //Manager's
        Manager m1 = new Manager("Salma", "Full-time", sal.managerLevel2);
        Manager m2 = new Manager("Amitabh", "Full-time", sal.managerLevel2);
        Manager m3 = new Manager("Jitesh", "Part-time", sal.managerLevel3);

        Object[] manArray = {m1, m2, m3};


        List<Object> man = new ArrayList<Object>();
        for (int a = 0; a < manArray.length; a++) {
            man.add(manArray[a]);
        }

        for (int b = 0; b < man.size(); b++) {
            System.out.println(man.get(b));
        }

        //Salary
        sal.sum(sal.engineerLevel1, sal.engineerLevel2, sal.engineerLevel3, sal.managerLevel2, sal.managerLevel3, sal.managerLevel2);
    }

}
