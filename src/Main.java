public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float result = service.calculate(93.7F, 1.97F);
        System.out.printf("%.2f", result);
    }
}
