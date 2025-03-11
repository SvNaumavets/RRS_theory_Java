package HW12;

public class Manager extends Employee{

    public Manager(String username, String password, String email, String employeeId) {
        super(username, password, email, employeeId);
    }

    @Override
    String manageOrders() {
        return "Manager " + super.getEmployeeId() + " manage order";
    }


    @Override
    String displayInfo() {
        String s = "Manager: " + getEmployeeId() + "\n"
                + "username: " + getUsername() + "\n"
                + "email: " + getEmail();
        return  s;
    }
}
