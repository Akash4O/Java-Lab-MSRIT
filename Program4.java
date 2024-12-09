import java.util.Scanner;

public class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Details of 2 Students : ");
        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Enter Details fot Student "+(i+1));
            students[i].readInput(sc);
        }

        System.out.println("The Student Details :");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.println();
        }

        System.out.println("Enter te Details for 2 Employess : ");
        Employee[] employees = new Employee[2];
        for (int i = 0; i < employees.length; i++) {
            employees[i] =  new Employee();
            System.out.println("Enter the Details for Employee "+(i+1));
            employees[i].readInput(sc);
        }

        System.out.println("The Employee Details : ");
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
            System.out.println();
        }

        System.out.println("The max Salary Employee Details : ");
        Employee max = new Employee();
        for (Employee employee : employees) {
            if(employee.getSal() > max.getSal()){
                max = employee;
            }
        }
        max.display();
        


        sc.close();        
    }
}

class Person{
    public String name;
    public int age;
    public String gender;

    public Person(){
        this.name = null;
        this.age = 0;
        this.gender = null;
    }

    void readInput(Scanner sc){
        System.out.println("Enter the name of the person :");
        this.name = sc.nextLine();
        System.out.println("Enter the age of the person :");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Gender of the person : ");
        this.gender = sc.nextLine();
    }

    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Gender : "+this.gender);
    }
}

class Student extends Person{
    public double cgpa;
    public String branch;
    public int year;

    public Student(){
        super();
        this.cgpa = 0;
        this.branch = null;
        this.year = 0;
    }

    void readInput(Scanner sc){
        super.readInput(sc);
        System.out.println("Enter the Cgpa of the student : ");
        this.cgpa = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Branch name of the Student : ");
        this.branch = sc.nextLine();
        System.out.println("Enter teh year in which Student is learning : ");
        this.year = sc.nextInt();
        sc.nextLine();
    }

    void display(){
        super.display();
        System.out.println("CGPA :"+this.cgpa );
        System.out.println("Branch : "+this.branch);
        System.out.println("Year : "+this.year);
    }
}

class Employee extends Person{
    public String destination;
    public double Salary;

    public Employee(){
        super();
        this.destination = null;
        this.Salary = 0;
    }

    void readInput(Scanner sc){
        super.readInput(sc);
        System.out.println("Enter the Designation of the employee : ");
        this.destination = sc.nextLine();
        System.out.println("Enter the Salary of the Employee");
        this.Salary = sc.nextDouble();
        sc.nextLine();
    }

    double getSal(){
        return this.Salary;
    }

}

