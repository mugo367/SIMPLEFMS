package simple.fms.model;


import simple.fms.model.enumFiles.Gender;

public class Employee {
    private String employeeNumber;
    private String employeeName;
    private String dateOfEmp;

    private Gender gender;
    private String email;
    private String contact;
    private String emergencyContact;

    public Employee(String employeeNumber, String employeeName, String dateOfEmp, Gender gender, String email, String contact, String emergencyContact) {
        this.employeeNumber =employeeNumber;
        this.employeeName = employeeName;
        this.dateOfEmp = dateOfEmp;
        this.gender = gender;
        this.email = email;
        this.contact = contact;
        this.emergencyContact = emergencyContact;
    }

    public Employee() {

    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDateOfEmp() {
        return dateOfEmp;
    }

    public void setDateOfEmp(String dateOfEmp) {
        this.dateOfEmp = dateOfEmp;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    @Override
    public String toString() {
        return
                "employeeNumber= " + employeeNumber +
                ", employeeName= " + employeeName +
                ", dateOfEmp= " + dateOfEmp +
                ", gender= " + gender +
                ", email= " + email +
                ", contact= " + contact +
                ", emergencyContact= " + emergencyContact ;
    }
}
