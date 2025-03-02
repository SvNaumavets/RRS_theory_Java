import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee testOne = new Employee("Bob", "23/05/1994","male", 33.5);
        Employee testTwo = new Employee("Rick", 25);
        Manager testThree = new Manager("Duck", 43.21, 16);

        Month[] monthArray = {MonthUtils.january, MonthUtils.february};
//        Month[] monthArray = {};

        System.out.printf("%.2f%n", testOne.getSalary(monthArray)); // 21*33.5 = 1407
        System.out.printf("%.2f%n", testThree.getSalary(monthArray)); //21*43.21+0.01*21*43.21*16=2105.19

//        Manager testOneConvert = testOne.convertToManager(15);
//        Manager testTwoConvert = testTwo.convertToManager(11);

//        System.out.printf("%.2f%n", testOneConvert.getSalary(monthArray)); //21*33.5*(1+0.01*15)=1618.05
//        System.out.printf("%.2f%n", testTwoConvert.getSalary(monthArray)); //21*25*(1+0.01*11)=1165.5

        Director testDirector = new Director("Nick", 18, 23);
        System.out.printf("%.2f%n", testDirector.getSalary(monthArray)); //21*18*(1+0.03*23)=1277,64

        Employee[] emTotal = {
                testOne, testTwo, testThree, testDirector
        };
        System.out.printf("%.2f%n", SalaryUtils.getTotalSalary(emTotal, monthArray)); // 1407 + 1050 + 2105,19 + 1277.64 = 5839.83

    }
}
