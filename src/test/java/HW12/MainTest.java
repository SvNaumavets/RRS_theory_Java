package HW12;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainTest {

    Customer custOne = new Customer("custOne", "1234", "custOne@gmail.com", "Cust Bob", "custOne Address");
    Manager mngOne = new Manager("mngOne", "m1234", "mngOne@gmail.com", "mngOne89");

    @DataProvider(name = "test1")
    public User[] testData(){
        return new User[]{
                custOne,
                mngOne
        };
    }

    @Test(dataProvider = "test1")
    public void displayInfoTest(User user){
        String expectedResult = "";
        String actualResult = user.displayInfo();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void makeOrderTest(){
        String expectedResult = "Customer Cust Bob place order";
        String actualResult = custOne.makeOrder();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void manageOrders(){
        String expectedResult = "Manager mngOne89 manage order";
        String actualResult = mngOne.manageOrders();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
