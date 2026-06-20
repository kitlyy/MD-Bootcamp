package SalaryCalculator;

public class SalaryCalculator {
    static void main(String[] args) {

        Employee Mike = new Employee(20000, 1000, 3.0);
        Employee Luna = new Employee(25000, 300, 2.0);
        System.out.println(Mike.getTotalSalary());
        System.out.println(Luna.getTotalSalary());
    }

    public static double getTotalSalary(boolean tyFin, double baseSal, int noSales, double com) {
        double bonus = 1000;
        double totalSalary = 0;
        if (tyFin) {
            totalSalary = (noSales > 500) ? baseSal + (noSales * com) + bonus : baseSal + (noSales * com);
        } return totalSalary;
    }
}
