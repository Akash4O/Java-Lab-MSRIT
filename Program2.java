import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter the Details for Employee : "+(i+1));
            employees[i] = new Employee();
            employees[i].inputDetails(sc);
        }

        System.out.println("\n Employee Details :");
        for (Employee employee : employees) {
            employee.displayEmployee();
        }

        Employee.sumSalary(employees);
        Employee.highestPaidManager(employees);

        sc.close();
    }
}


class Employee {
    public int age,employeeId;
    public Double salary;
    public String name,designation,department;

    void inputDetails( Scanner sc) {
        
        System.out.println("Enter the Name : ");
        name = sc.nextLine();
        System.out.println("Enter the age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Employee ID : ");
        employeeId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the salary : ");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Dsignation : ");
        designation = sc.nextLine();
        System.out.println("Enter the Department :");
        department = sc.nextLine();
        
    }

    void displayEmployee(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+designation);
        System.out.println("Department : "+department);
        System.out.println();
    }

    static void sumSalary(Employee[] employees){
        Double sum = 0.0;
        for(Employee employee : employees){
            if (employee.department.equalsIgnoreCase("sales")) {
                sum = sum + employee.salary;
            }
        }
        System.out.println("The sum of the Salaries of the sales department : "+sum);
    }

    static void highestPaidManager(Employee[] employees){
        Employee highest = null;
        for (Employee employee : employees) {
            if (employee.department.equalsIgnoreCase("Purchase") && employee.designation.equalsIgnoreCase("Manager")) {
                highest = employee;
            }
        }
        if (highest != null) {
            System.out.println("The Highest Paid Manager Details of the Purchase Department:");
            highest.displayEmployee();    
        }else{
            System.out.println("No manager found in the purchase department.");
        }
        
    }
}

