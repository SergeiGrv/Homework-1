public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{5, 7, 18, 23, 9, 32, 2, 11});
        System.out.println(salesManager.max());
    }
}
