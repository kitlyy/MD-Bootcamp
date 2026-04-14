package SalaryCalculator;

public class SalaryCalculator {
    static void main(String[] args) {

        //before refactoring
//        boolean taxYearEnded = true;
//
//        double baseSalary = 20000;
//
//        int numberOfSales = 1000;
//        double bonus = 1000;
//        double commissionRate = 3.0;
//
//        if (taxYearEnded) {
//            double totalSalary = baseSalary + (numberOfSales * commissionRate);
//            if (numberOfSales > 500) {//                only give bonus when sales exceed 500:
//                totalSalary += bonus;
//                System.out.println("Total salary after bonus: " + totalSalary);
//            }
//        }
//         sales person 2:
//        numberOfSales = 300;
//        baseSalary = 25000;
//        commissionRate = 2.0;
//
//        if (taxYearEnded) {
//            double totalSalary = baseSalary + (numberOfSales * commissionRate);
//            System.out.println("Total salary: " + totalSalary);
//        }

        //after refactoring
//        double salary1 = getTotalSalary(taxEnded, 20000,1000, 3.0);
//        double salary2 = getTotalSalary(taxEnded, 25000,300,2.0);
//        System.out.println("Employee 1 salary: " + salary1 +
//                "\nEmployee 2 salary: " + salary2);

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
