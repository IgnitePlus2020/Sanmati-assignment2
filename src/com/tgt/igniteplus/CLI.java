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
                    "4:Displaying the details of all the employees in the departments\n" +
                    "5:Creating and adding a new employee into an existing department\n" +
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
                case 4:display();
                        break;
                case 5:addEmp();
                        break;
                case 6:swapEmp();
                        break;
                default:
            }
            System.out.println("Do you want to continue?? Press 1 for YES and 0 for NO");
            ans= in.nextInt();
        }while(ans==1);
    }
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
    public static void addDept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the department you want to add");
        String dep= in.nextLine();
        emp.put(dep,null);
        dept.add(dep);
        System.out.println("Department added");
        //System.out.println("Do you want to add members to the this department? \n Press 1 for YES and 0 for NO");
        //int choice=in.nextInt();
        //if(choice==1)
            //addEmp();

    }
    public static void deleteDept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the department you want to delete");
        String dep = in.nextLine();
        if(dept.contains(dep))
        {
            dept.remove(dep);
            emp.remove(dep);
        }
        else
            System.out.println("Department does not exist");
    }
    public static void displayDept(){
        if(dept.isEmpty())
            System.out.println("No departments exist");
        else{
            System.out.println("The existing departments are ");
            for(String dep:dept)
                System.out.println(dep+ "\n");
        }

    }
    public static void addEmp(){
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
        while(!(ss=in.nextLine()).equals("done"))
            skillSet.add(ss);
        displayDept();
        System.out.println("Enter the department in which the employee should be added");
        String dep= in.nextLine();
        empObj.add(new collections(name, college, dep, age,skillSet));
    }
    static public void swapEmp(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of employee you want to move into another department");
        String empName=in.nextLine();
        System.out.println("This is the list of departments ");
        for(String dep: dept)
            System.out.println(dep + "\n");
        System.out.println("Enter the old department from which the employee should be removed from");
        String dep1 = in.nextLine();
        System.out.println("Enter the new department into which the employee should be added into");
        String dep2 = in.nextLine();
        for (collections im : empObj) {
            if (im.getName().contains(empName))
                im.setDepartment(dep2);
        }


    }
}
