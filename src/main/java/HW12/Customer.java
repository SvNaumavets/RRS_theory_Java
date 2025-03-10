package HW12;

public class Customer extends RegisteredUser{

    public Customer(String username, String password, String email, String fullName, String address) {
        super(username, password, email, fullName, address);
    }

    @Override
    String makeOrder() {
        return null;
    }

    @Override
    void displayInfo() {

    }
}
