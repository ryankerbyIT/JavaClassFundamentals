public class EmployeeTest {
    public static void main(String[] args) {
        // Creating three Employee objects with the provided data
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // Displaying employee data
        System.out.println("Name: " + emp1.getName() + "\tID Number: " + emp1.getIdNumber() + 
                           "\tDepartment: " + emp1.getDepartment() + "\tPosition: " + emp1.getPosition());

        System.out.println("Name: " + emp2.getName() + "\tID Number: " + emp2.getIdNumber() + 
                           "\tDepartment: " + emp2.getDepartment() + "\tPosition: " + emp2.getPosition());

        System.out.println("Name: " + emp3.getName() + "\tID Number: " + emp3.getIdNumber() + 
                           "\tDepartment: " + emp3.getDepartment() + "\tPosition: " + emp3.getPosition());
    }
}
/*
Explanation:
Employee Class: Contains fields for name,
ID number, department, and position. It 
also includes three constructors:

A constructor that takes only name and ID number, 
with department and position defaulted to empty strings.
A constructor that accepts all fields as arguments.
A no-argument constructor that initializes all 
fields to default values. Mutator Methods: These are 
setters that allow the modification of the private fields.

Accessor Methods: These are getters that return 
the values of the fields.

EmployeeTest Class: This class creates three 
Employee objects (Susan Meyers, Mark Jones, Joy Rogers) 
and prints out their details.
*/