package com.tgt.igniteplus;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CLI {
    static List<String> dept = new ArrayList<>();
    static Map<String,List<collections>> emp= new HashMap<>();
    static Set<String> skillSet = new HashSet<>();
    static List<collections> empObj = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans,choice;
        do{
            System.out.println("Choose among the following options by pressing the appropriate number\n" +
                    "1:Creating a new department\n" +
                    "2:Deleting an existing department\n" +
                    "3:Display all the departments\n"+
                    "4:Creating and adding a new employee into an existing department\n"
                    "5:Displaying the details of all the employees in the departments\n" +
                    "6:Swapping the department of any employee");
            choice= in.nextInt();
            switch(choice)
            {
                case 1: addDept();
                        break;
                case 2:deleteDept();
                        break;
                case 3:displayDept();
                        break;
                case 4:addEmp(null);
                        break;
                case 5:display();
                        break;
                case 6:swapEmp();
                        break;
                default:
            }
            System.out.println("Do you want to continue?? Press 1 for YES and 0 for NO");
            ans= in.nextInt();
        }while(ans==1);
    }
    
    //Displaying details of all the employess departemnt wise
    public static void display()
    {
        for(String dep: emp.keySet()){
            System.out.println("Department name: "+ dep);
            System.out.println("***************************************");
            for(collections mem : empObj) {
                System.out.println(mem.getName() + "\t" + mem.getSkillSet());
            }
            System.out.println("********************************************");
        }
    }
    
    //Adding a new department 
    public static void addDept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the department you want to add");
        String dep= in.nextLine();
        emp.put(dep,null);
        dept.add(dep);
        System.out.println("Department added");
        System.out.println("Add member to the this department");
        addEmp(dep);
    }
    
    //Deleting an existing department
    public static void deleteDept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the department you want to delete");
        String dep = in.nextLine();
        if(dept.contains(dep))//Checking if department exists 
        {
            dept.remove(dep);
            emp.remove(dep);
        }
        else
            System.out.println("Department does not exist");
    }
    
    //Displaying list of departments
    public static void displayDept(){
        if(dept.isEmpty())
            System.out.println("No departments exist");
        else{
            System.out.println("The existing departments are ");
            for(String dep:dept)
                System.out.println(dep+ "\n");
        }
    }
    
    //Adding an employee into existing department
    public static void addEmp(String dep){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String name =in.nextLine();
        do {
            for (collections im : empObj) {
                if (im.getName().contains(name)) {
                    System.out.print("\nName already exists!\n" + "Enter a UNIQUE name:\t");
                    name = in.next();
                }
            }
        } while (empObj.contains(name));
        System.out.println("Enter the college of the employee");
        String college = in.nextLine();
        System.out.println("Enter the age of the employee");
        int age=in.nextInt();
        System.out.println("Enter skillset of the employee(Type done after you are done)");
        String ss;
        while(true)
        {
            if(!(ss=in.nextLine()).equalsIgnoreCase("done"))
                skillSet.add(ss);
        }
        
        if(dep==null)
        {
            displayDept();
            System.out.println("Enter the department in which the employee should be added");
            String dep= in.nextLine();
            empObj.add(new collections(name, college, dep, age,skillSet));
        }
        else
            empObj.add(new collections(name, college, dep, age,skillSet));
    }
            
    static public boolean swapEmp(){
        int deptExists = 0;
        int empExists = 0;
        String department = null;

        System.out.print("Enter emplouyee's name whose department you want to change:\t");
        String empName = in.next();
        //Checking if the employee exists or not in the department
        do {
            for (collections employee : empObj) {
                if (employee.getName().contains(memName)) 
                {
                    empExists = 1;
                } 
                else 
                {
                    System.out.println("Member doesn't exist!\n" + "Enter an existing member's name:\t");
                    empName = in.next();
                    empExists = 0;
                }
            }
        }while (empExists == 0);


        //Enter a valid department option
        do {
            displayDept();
            System.out.println("Enter your choice of department:");
            int deptChoice = in.nextInt();
            int k = 1;
            for (String deptObj : dept) {
                if (k == deptChoice) 
                {
                    department = deptObj;
                    deptExists = 1;
                    break;
                }
                k++;
            }
             if (deptExists == 0)
             System.out.print("Department doesn't exist!\n" +"Enter an existing department:\t");
        } while (deptExists == 0);


        //Check if swap is possible or not
        for (String deptIterator : emp.keySet()) {
            List<collections> employees = emp.get(deptIterator);

            for (collections employee : employees) {
                if (employee.getName().equals(name)) {

                    //Since every department must have atleast one member
                    if (employees.size() == 1) {
                        System.out.println(name + " is the only member of the department " + deptIterator);
                        System.out.println("Swap is not possible!");
                        return false;
                    } else {

                        emp.get(department).add(employee);
                        emp.get(deptIterator).remove(employee);
                    }
                }
            }
        }
        return true;
    }
}
