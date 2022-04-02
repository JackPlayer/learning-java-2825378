public class Main {

    public static void main(String[] args) {
        System.out.println("Yearly Salary: " + calculateYearlySalary(40, 15.00));
        System.out.println("Yearly Salary (10 vacation days): " + calculateYearlySalary(40, 15.00, 10));
    }

    public static double calculateYearlySalary(int hoursPerWeek, double payPerHour) {
        if (hoursPerWeek < 0 || payPerHour < 0) return 0;

        final int NUM_WEEKS = 52;
        double payPerWeek = hoursPerWeek * payPerHour;
        return payPerWeek * NUM_WEEKS;
    }

    public static double calculateYearlySalary(int hoursPerWeek, double payPerHour, int vacationDays) {
        if (hoursPerWeek < 0 || payPerHour < 0) return 0;

        final int NUM_WEEKS = 52;
        double payPerWeek = hoursPerWeek * payPerHour;
        double deduction = (payPerHour * 8) * vacationDays;
        return payPerWeek * NUM_WEEKS - deduction;
    }
}
