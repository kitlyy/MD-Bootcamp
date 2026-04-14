package SalaryCalculator;

public class Employee {

    double baseSal;
    int numSales;
    double commission;
    double totalSalary;

    boolean taxEnded = true;
    double bonus = 1000;

    public Employee(double baseSal, int numSales, double commission) {
        this.baseSal = baseSal;
        this.numSales = numSales;
        this.commission = commission;
    }

    //double salary1 = getTotalSalary(taxEnded, 20000, 1000, 3.0);

    double getTotalSalary() {
        if (taxEnded) {
            this.totalSalary = (this.numSales > 500) ? this.baseSal + (this.numSales * this.commission) + this.bonus :
                    this.baseSal + (this.numSales * this.commission);
        } return this.totalSalary;
    }
}
