package HW12;

abstract public class User {
    /*
    Иерархия классов для системы онлайн-магазина
    Класс User для хранения и манипуляции данными о всех пользователях системы
     */
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    abstract String displayInfo();
}
