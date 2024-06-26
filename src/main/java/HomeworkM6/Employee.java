package HomeworkM6;

import java.util.stream.Stream;

public abstract class Employee {

    private String name;
    private int id;
    private String title;
    private   String dateOfBirth;
    private Double salary;
    private  String address;

    public  Employee(String employeeName, int employeeId, String employeeTitle, String employeeDateOfBirth, double employeeSalary, String employeeAddress){


        this.name = employeeName;
        this.id = employeeId;
        this. title = employeeTitle;
        this.dateOfBirth = employeeDateOfBirth;
        this.salary = employeeSalary;
        this.address = employeeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary(){
        System.out.println("The salary was sent to the employee bank account");
    }

    public String toString(){
        String txt = String.format("Employee name: %s, id %s, title: %s, dateOfBirth: %s,  address: %s,salary: %f ", name, id, title, dateOfBirth, address,salary);
        return txt;
    }

}
