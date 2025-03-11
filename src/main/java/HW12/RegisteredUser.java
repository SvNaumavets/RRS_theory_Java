package HW12;

abstract class RegisteredUser extends User {
    /*
    Иерархия классов для системы онлайн-магазина
    Класс RegisteredUser для зарегистрированных пользователей.
     */

    private String fullName;
    private String address;

    public RegisteredUser(String username, String password, String email, String fullName, String address) {
        super(username, password, email);
        this.fullName = fullName;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    abstract String makeOrder();
}
