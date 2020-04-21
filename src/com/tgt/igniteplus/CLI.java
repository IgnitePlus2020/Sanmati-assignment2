package com.tgt.igniteplus;

import java.util.*;

public class CLI {
    static List<String> dept = new ArrayList<>();
    static Map<String,List<collections>> emp= new HashMap<>();
    static Set<String> skillSet = new HashSet<>();

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
            for(collections i: emp.get(dep))
                System.out.println(i.print());
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
        System.out.println("Enter the college of the employee");
        String college = in.nextLine();
        System.out.println("Enter the age of the employee");
        int age=in.nextInt();
        System.out.println("Enter skillset of the employee(Type done after you are done)");
        String ss;
        while(!(ss=in.nextLine()).equals("done"))
            skillSet.add(ss);
        List<collections> coll = new ArrayList<>();
        coll.add(new collections(name,college,age,skillSet));
        displayDept();
        System.out.println("Enter the department in which the employee should be added");
        String dep= in.nextLine();
        if(dept.contains(dep))
            emp.put(dep,coll);
        else
            System.out.println("Sorry department does not exist");
    }
    static public void swapEmp(){
        Scanner in = new Scanner(System.in);
        System.out.println("This is the list of departments ");
        for(String dep: dept)
            System.out.println(dep + "\n");
        System.out.println("Enter the old department from which you want to move the employee");
        String dep1= in.nextLine();
        System.out.println("The employees in this department are");
        if(emp.containsKey(dep1))
            System.out.println();
        System.out.println("Enter the new department into which the employee should be added into");
        String dep2 = in.nextLine();

    }
}
