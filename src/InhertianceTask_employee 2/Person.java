package InhertianceTask_employee;// Write a Java program to create a class known as EMployteTASK.Person with methods called getFirstName() and getLastName().
// Create a subclass called EMployteTASK.Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.


public class Person {
    private String firstName;
    private String lastName;


    Person(String firstName, String FirstName){
        this.firstName = firstName;
        this.lastName = FirstName;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
