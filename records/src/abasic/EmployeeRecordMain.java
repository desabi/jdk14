package abasic;

public class EmployeeRecordMain {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord  = new EmployeeRecord("Abi", 12345);
        System.out.println("employeeRecord = " + employeeRecord);

        System.out.println("Name: " + employeeRecord.name());
        System.out.println("Number: " + employeeRecord.employeeNumber());
    }
}