public class BmiService {
    public int calculate(int weight, double growth) {
        double result;
        result = weight / (growth * growth);
        return (int) result;
    }
}
