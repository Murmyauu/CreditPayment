public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж на 12 месяцев: " + creditPaymentService.calculate(1_000_000, 12, 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж на 24 месяца: " + creditPaymentService.calculate(1_000_000, 24, 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж на 36 месяцев: "+ creditPaymentService.calculate(1_000_000, 36, 9.99));

    }
}