package HomeworkM6;

import static HomeworkM6.consts.MANAGER_DEFAULT_SALARY;

public class Manager extends Employee{

       public Manager(String employeeName, int employeeId,  String employeeDateOfBirth,  String employeeAddress) {
        super(employeeName, employeeId, consts.MANAGER_TYPE , employeeDateOfBirth, MANAGER_DEFAULT_SALARY, employeeAddress);
    }

    public void hireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was hired", employeeName));
    }

    public void fireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was fired", employeeName));

    }
}

