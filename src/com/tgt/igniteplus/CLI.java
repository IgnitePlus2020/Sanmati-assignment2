/*
Command line Interface to demonstrate the use of collections
1) User should be able to create,delete,update and display department and its employees
2)Each and every department should have atleast one employee
3)Department can have more than one ignite member
*/

package com.tgt.igniteplus;
import java.util.*;

public class CLI {
    static List<collections> dataScience = new ArrayList<>();
    static List<collections> infrastructure = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Set<String> skillSet1 = new HashSet<>();
        skillSet1.add("Java");
        skillSet1.add("SQL");
        skillSet1.add("DS");

        Set<String> skillSet2 = new HashSet<>();
        skillSet2.add("Java");
        skillSet2.add("NoSQL");
        skillSet2.add("Machine Learning");

        dataScience.add(new collections("Sam", "MVIT",20,skillSet1));

        Set<String> skillSet3 = new HashSet<>();
        skillSet3.add("Linux");
        skillSet3.add("PSQL");
        skillSet3.add("Scripting");

        Set<String> skillSet4 = new HashSet<>();
        skillSet4.add("Chef");
        skillSet4.add("React");
        skillSet4.add("AI");

        infrastructure.add(new collections("Sammy", "VIT", 20, skillSet3));

        int ans;
        do {
            int choice;
            System.out.println("Select your choice: 1 for Adding \t 2 for Deleting \t 3 for Displaying ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    //addEmployee();
                    break;
                case 2:
                    //deleteEmployee();
                    break;
                case 3:
                    display();
                default:
            }
            System.out.println("Do you want to continue: Enter 1 for Yes and Enter 0 for No");
            ans = in.nextInt();
        } while (ans == 1);


    }

    private static void display() {
        System.out.println("This is the list of existing members and the departments they belong to:");
        Map<String, List<collections>> emp = new HashMap<>();
        emp.put("Data Science",dataScience);
        emp.put("Infrastructure", infrastructure);
        for (String dept : emp.keySet()) {
            System.out.println("Department Name: " + dept);
            System.out.println("-----------------------------------");
            for (collections i : emp.get(dept))
                System.out.println(i.print());
            System.out.println("-----------------------------------");
        }
    }

}

/*
Output:
Select your choice: 1 for Adding 	 2 for Deleting 	 3 for Displaying
3
This is the list of existing members and the departments they belong to:
Department Name: Data Science
-----------------------------------
Name: Sam
Skill Set is [Java, SQL, DS]
-----------------------------------
Department Name: Infrastructure
-----------------------------------
Name: Sammy
Skill Set is [Linux, PSQL, Scripting]
-----------------------------------
Do you want to continue: Enter 1 for Yes and Enter 0 for No
 */