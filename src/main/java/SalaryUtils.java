public class SalaryUtils {

    public static double getTotalSalary(Employee[] employees, Month[] monthArray){
        double sum = 0;
        for (int i = 0; i < employees.length; i++){
            sum += employees[i].getSalary(monthArray);
        }
        return sum;
    }
}
