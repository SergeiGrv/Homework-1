public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    int average;

    public int averageSales() {
        int minNumber = sales[0];
        int maxNumber = sales[0];
        int sum = 0;
        if (sales.length < 5) {
            System.out.println("Недостаточно данных!");
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minNumber) {
                minNumber = sales[i];
            } else if (sales[i] > maxNumber) {
                maxNumber = sales[i];
            }
            sum += sales[i];
        }
        sum = sum - (minNumber + maxNumber);
        return average = sum / (sales.length - 2);
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}