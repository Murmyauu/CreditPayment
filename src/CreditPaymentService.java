public class CreditPaymentService {

    public double calculate(int credit, int months, double percent) {
        double monthlyPercent = percent/ 12/ 100;
        double coefficient = calculateAnnouite(monthlyPercent, months);
        double payment = coefficient * credit;
        return payment;
        }

    private double calculateAnnouite(double monthlyPercent, int months) {
        double x = 1 + monthlyPercent;
        double coefficient = monthlyPercent * Math.pow(x, months) / (Math.pow(x, months) -1);
        return coefficient;
    }
}
