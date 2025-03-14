public class Employee {
    private int empNumber;
    private String firstName;
    private String lastName;
    private String department;
    private String designation;

    public Employee(int empNumber, String firstName, String lastName, String department, String designation) {
        this.empNumber = empNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.designation = designation;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void displayEmployee() {
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("----------------------------------");
    }
}
