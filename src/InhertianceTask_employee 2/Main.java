package InhertianceTask_employee;// Write a Java program to create a class known as EMployteTASK.Person with methods called getFirstName() and getLastName().
// Create a subclass called EMployteTASK.Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Oscar", "Horbaczynski");
        System.out.println(myPerson.getFirstName() + " " + myPerson.getLastName()) ;
        Employee myEmployeeID = new Employee("Oscar", "h", 4441, "Worker");
        System.out.println(myEmployeeID.getFirstName() + " " + myEmployeeID.getLastName()+" "+ myEmployeeID.getEmployeeID() + " "+ myEmployeeID.getJobTitle()) ;
    }
}