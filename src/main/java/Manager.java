public class Manager extends Employee {

    int numberOfSubordinates;
    final double percent = 0.01;

    public Manager (String name, double salaryPerDay, int numberOfSubordinates){
        super(name, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager (String name, String age, String sex, double salaryPerDay, int numberOfSubordinates) {
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
