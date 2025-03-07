package HW10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    Employee bob = new Employee("Bob", "23/05/1994","male", 33.5);
    Employee rick = new Employee("Rick", 25);
    Manager duckManager = new Manager("Duck", 43.21, 16);

    Month[] monthArray = {MonthUtils.january, MonthUtils.february};

    Director nickDirector = new Director("Nick", 18, 23);

    Employee[] emTotal = {
            bob, rick, duckManager, nickDirector
    };

    @Test
    public void getSalaryEmployeeTest(){
        double expectedResult = 1407;
        double actualResult = bob.getSalary(monthArray);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void getSalaryManagerTest(){
        double expectedResult = 2105.19;
        double actualResult = Math.round(duckManager.getSalary(monthArray) * 100) / 100.0;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void getSalaryDirectorTest(){
        double expectedResult = 1277.64;
        double actualResult = Math.round(nickDirector.getSalary(monthArray) * 100) / 100.0;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void getTotalSalaryTest(){
        double expectedResult = 5839.83;
        double actualResult = Math.round(SalaryUtils.getTotalSalary(emTotal, monthArray) * 100) / 100.0;
        Assert.assertEquals(actualResult, expectedResult);
    }


}
