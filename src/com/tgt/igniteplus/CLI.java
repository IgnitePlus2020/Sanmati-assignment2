package com.tgt.igniteplus;

import java.util.*;

public class CLI {
    static List<String> dept = new ArrayList<>();
    static Map<String,List<collections>> emp= new HashMap<>();
    static List<collections> coll = new ArrayList<>();
    static Set<String> skillSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans,choice;
        do{
            System.out.println("Choose among the following options by pressing the appropriate number\n1:Creating a new department\n2:Deleting an existing department\n3:Displaying the details of all the employees in the departments\n4:Creating and adding a new employee into an existing department");
            choice= in.nextInt();
            switch(choice)
            {
                case 1: addDept();
                        break;
                case 2:deleteDept();
                        break;
                case 3:display();
                        break;
                case 4:addemp();
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
    public static void addemp(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String name =in.nextLine();
        System.out.println("Enter the college of the employee");
        String college = in.nextLine();
        System.out.println("Enter the age of the employee");
        int age=in.nextInt();
        System.out.println("Enter skillset of the employee(Type done after you are done)");
        String ss=in.nextLine();
        skillSet.add(ss);
        coll.add(new collections(name,college,age,skillSet));
        System.out.println("Enter the department in which the employee should be added");
        String dep= in.nextLine();
        if(dept.contains(dep))
            emp.put(dep,coll);
    }
}
