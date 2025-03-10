package HW12;

abstract class Employee extends User {
    /*
    Иерархия классов для системы онлайн-магазина
    Класс Employee для сотрудников.
     */

    private String employeeId;

    public Employee(String username, String password, String email, String employeeId) {
        super(username, password, email);
        this.employeeId = employeeId;
    }

    abstract String manageOrders();
}