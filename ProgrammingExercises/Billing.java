public class Billing
{
    public static void main(String[] args)
    {
        double totalDue;
        int price = 250;
        int quantity = 3;
        int couponValue = 100;
        final double TAX = 0.08;

        totalDue = computeBill(price, TAX);
        System.out.println("Total due (1 parameter): " + totalDue);

        totalDue = computeBill(price, quantity, TAX);
        System.out.println("Total due (2 parameters): " + totalDue);

        totalDue = computeBill(price, quantity, couponValue, TAX);
        System.out.println("Total due (3 parameters): " + totalDue);
    }

    private static double computeBill(int a, double TAX)
    {
        return (a * (1 + TAX));
    }
    private static double computeBill(int a, int b, double TAX)
    {
        return (a * b * (1 + TAX));
    }
    private static double computeBill(int a, int b, int c, double TAX)
    {
        return ((a * b - c) * (1 + TAX));
    }

}
