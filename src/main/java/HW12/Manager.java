package HW12;

public class Manager extends Employee{

    public Manager(String username, String password, String email, String employeeId) {
        super(username, password, email, employeeId);
    }

    @Override
    String manageOrders() {
        return null;
    }


    @Override
    void displayInfo() {

    }
}
