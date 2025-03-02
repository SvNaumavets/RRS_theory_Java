public class Employee {
    String name;
    String age;
    String sex;
    double salaryPerDay;

    public Employee (String name, double salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public Employee (String name, String age, String sex, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public double getSalary(Month[] monthArray){
        double temp = 0;
        for (int i = 0; i < monthArray.length; i++){
            temp += salaryPerDay * monthArray[i].workDays;
        }
        return temp;
    }

    public Manager convertToManager(int numberOfSubordinates){
        return new Manager(this.name, this.age, this.sex, this.salaryPerDay, numberOfSubordinates);
    }



    }
