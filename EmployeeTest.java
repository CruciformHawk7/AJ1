import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String Name;
    int empNo;
    String dept;
    float salary;
    BufferedReader br;

    Employee() {
        Name = "";
        empNo = 0;
        dept = "";
        salary = 0f;
    }

    Employee(String Name, int empNo, String dept) {
        this.Name = Name;
        this.empNo = empNo;
        this.dept = dept;
        this.salary = 0f;
    }

    void getData() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name: ");
        Name = br.readLine();
        System.out.println("Enter the Employee Number: ");
        empNo = Integer.parseInt(br.readLine());
        System.out.println("Enter the Department: ");
        dept = br.readLine();
    }

    void showData() {
        System.out.println("Name: \t\t " + this.Name);
        System.out.println("Employee Number: " + this.empNo);
        System.out.println("Department: \t " + this.dept);
        System.out.println("Salary: \t " + this.salary);
    }
}

class SalEmployee extends Employee {
    SalEmployee() {
        super();
    }

    void getData() throws IOException {
        super.getData();
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter salary: ");
        salary = Float.parseFloat(br.readLine());
    }
}

class DailyEmployee extends Employee {
    DailyEmployee() {
        super();
    }

    void getData() throws IOException {
        super.getData();
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter hours: ");
        int hours = Integer.parseInt(br.readLine());
        salary = hours * 500;
    }
}

class EmployeeTest {

    static void showMenu() {
        System.out.println("Enter your choice: ");
            System.out.println("1. Add SalariedEmployee");
            System.out.println("2. Add DailyEmployee");
            System.out.println("3. Display");
            System.out.println("4. Exit");
    }
    public static void main(String args[]) throws IOException {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        int store = 0;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice!=4) {
            showMenu();
            choice = sc.nextInt();
            switch(choice) {
                case 1: 
                    Employee emp = new SalEmployee();
                    emp.getData();
                    employees.add(emp);
                break;
                case 2:
                    Employee em = new DailyEmployee();
                    em.getData();
                    employees.add(em);
                break;
                case 3:
                    for (Employee e : employees) {
                        e.showData();
                    }
                break;
                case 4: 
                    System.exit(0);
                break;
                default:
                    System.out.println("Invalid choice entered.");
            }
        }
        sc.close();
    }
}