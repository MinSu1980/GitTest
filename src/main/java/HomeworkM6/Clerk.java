package HomeworkM6;

public class Clerk extends Employee {


    public Clerk(String employeeName, int employeeId,  String employeeDateOfBirth,  String employeeAddress) {
        super(employeeName, employeeId, consts.CLERK_TYPE, employeeDateOfBirth, consts.CLERK_DEFAULT_SALARY, employeeAddress);
    }
    public void makeCall(String customerName){
        System.out.println(String.format("Connected to customer %s", customerName));
    }

    public void getCall(String customerName){
        System.out.println(String.format("Answered to customer %s", customerName));

    }

}
