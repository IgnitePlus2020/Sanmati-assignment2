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
    static Set<String> skillSet1= new HashSet<>();
    static Set<String> skillSet2 = new HashSet<>();
    static Set<String> skillSet3 = new HashSet<>();
    static Set<String> skillSet4 = new HashSet<>();
    static Map<String, List<collections>> emp = new HashMap<>();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Set<String> skillSet1= new HashSet<>();
        skillSet1.add("Java");
        skillSet1.add("SQL");
        skillSet1.add("DS");

        //Set<String> skillSet2 = new HashSet<>();
        skillSet2.add("Java");
        skillSet2.add("NoSQL");
        skillSet2.add("Machine Learning");

        dataScience.add(new collections("Sam", "MVIT",20,skillSet1));

        //Set<String> skillSet3 = new HashSet<>();
        skillSet3.add("Linux");
        skillSet3.add("PSQL");
        skillSet3.add("Scripting");

        //Set<String> skillSet4 = new HashSet<>();
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
                case 1: addEmployee();
                    break;
                case 2: deleteEmployee();
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
    private static void addEmployee() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name,college,age");
        String name = in.nextLine();
        String college = in.nextLine();
        int age = in.nextInt();
        System.out.println("Enter the department you want to add the employee into 1)Data Science or 2)Infrastruture");
        int dept = in.nextInt();
        System.out.println("Choose the skillset: 1) Java, SQL, DS  \t 2) Java,NoSQL,Machine Learning \t 3) Linux, PSQL, Scripting \t 4) Chef,React,AI");
        int ch = in.nextInt();
        if (dept == 1) {
            switch (ch) {
                case 1: dataScience.add(new collections("Sammy", "VIT", 20, skillSet1));
                    break;
                case 2:dataScience.add(new collections("Sammy", "VIT", 20, skillSet2));
                    break;
                case 3:dataScience.add(new collections("Sammy", "VIT", 20, skillSet3));
                    break;
                case 4:dataScience.add(new collections("Sammy", "VIT", 20, skillSet4));
                    break;
                default:
            }
        }
        if(dept==2)
        {
            switch (ch) {
                case 1:infrastructure.add(new collections("Sammy", "VIT", 20, skillSet1));
                    break;
                case 2:infrastructure.add(new collections("Sammy", "VIT", 20, skillSet2));
                    break;
                case 3:infrastructure.add(new collections("Sammy", "VIT", 20, skillSet3));
                    break;
                case 4:infrastructure.add(new collections("Sammy", "VIT", 20, skillSet4));
                    break;
                default:
            }
        }
        System.out.println("Employee successfully added");
    }
    public static void deleteEmployee(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of employee you want to delete");
        String name = in.nextLine();
        System.out.println("Enter the department you want to delete the employee into 1)Data Science or 2)Infrastruture");
        int dept = in.nextInt();
        if (dept == 1) {
            dataScience.remove(name);
        }
        if(dept==2){
            infrastructure.remove(name);
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
1
Select your choice: 1 for Adding 	 2 for Deleting 	 3 for Displaying
1
Enter name,college,age
Sanmati
VTU
23
Enter the department you want to add the employee into 1)Data Science or 2)Infrastruture
1
Choose the skillset: 1) Java, SQL, DS  	 2) Java,NoSQL,Machine Learning 	 3) Linux, PSQL, Scripting 	 4) Chef,React,AI
2
Employee successfully added
Do you want to continue: Enter 1 for Yes and Enter 0 for No
1
Select your choice: 1 for Adding 	 2 for Deleting 	 3 for Displaying
3
This is the list of existing members and the departments they belong to:
Department Name: Data Science
-----------------------------------
Name: Sam
Skill Set is [Java, SQL, DS]
Name: Sammy
Skill Set is [Java, NoSQL, Machine Learning]
-----------------------------------
Department Name: Infrastructure
-----------------------------------
Name: Sammy
Skill Set is [Linux, PSQL, Scripting]
-----------------------------------
Do you want to continue: Enter 1 for Yes and Enter 0 for No
0
 */