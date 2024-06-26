package HomeworkM6;

public class Accountant extends  Employee{
    public Accountant(String employeeName, int employeeId,  String employeeDateOfBirth,  String employeeAddress) {
        super(employeeName, employeeId, consts.ACCONTANT_TYPE, employeeDateOfBirth, consts.ACCOUNTANT_DEFAULT_SALARY, employeeAddress);
    }

    public void createReport(){
        System.out.println("Report Created");
    }


}
