package chapter4;

public class TaxCalculator {
    private double salary;


    public double citizenSalary(double salary) {
        double newSalary = 0.00;
        double excess = 0;
        if (salary >= 0 && salary <= 30_000) {
            return belowThirty(salary);
        } else if (salary > 30000) {
            excess = salary - 30000;
            newSalary = (20 * excess) / 100;
            newSalary = newSalary + belowThirty(30000);
        }
        return newSalary;
    }

    private double belowThirty(double salary) {
        salary = (15 * salary) / 100;
        return salary;
    }

    public double totalTax(double first, double second, double third) {
        return first + second + third;
    }
}





