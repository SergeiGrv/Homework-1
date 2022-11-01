public class SalesManager {
    protected long[] sales;

    protected long average;

    protected SalesManager(long[] sales) {
        this.sales = sales;
    }

    protected long averageSales() {
        long minNumber = sales[0];
        long maxNumber = sales[0];
        long sum = 0;
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

    protected long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}