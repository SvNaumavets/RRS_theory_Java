package HW10;

public class Director extends Employee {

    private int numberOfSubordinates;
    final double percent = 0.03;

    public Director (String name, double salaryPerDay, int numberOfSubordinates){
        super(name, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Director (String name, String age, String sex, double salaryPerDay, int numberOfSubordinates) {
        super(name, age, sex, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public double getSalary(Month[] monthArray){
        return (1 + percent * numberOfSubordinates) * super.getSalary(monthArray);
    }
}
