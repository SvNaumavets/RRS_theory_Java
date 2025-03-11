package HW12;

public class Customer extends RegisteredUser{

    public Customer(String username, String password, String email, String fullName, String address) {
        super(username, password, email, fullName, address);
    }

    @Override
    String makeOrder() {
        return "Customer " + super.getFullName() + " place order";
    }

    @Override
    String displayInfo() {
        String s = "Customer: " + getFullName() + "\n"
                + "username: " + getUsername() + "\n"
                + "address: " + getAddress() + "\n"
                + "email: " + getEmail();
        return s;
    }
}
