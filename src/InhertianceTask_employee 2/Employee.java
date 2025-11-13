package InhertianceTask_employee;// Create a subclass called EMployteTASK.Employee that adds a new method named getEmployeeId() and overrides the getLastName() method
// to include the employee's job title.


public class Employee extends Person {
    int employeeID;
    String jobTitle;
    public  Employee(String firstName, String lastName,int employeeID,String jobTitle ) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;


    }
    public int getEmployeeID() {
        return employeeID;
    }
    public String getJobTitle() {
        return jobTitle;
    }

}
