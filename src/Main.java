public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 75; // масса тела, кг
        double growth = 1.70; // рост, м
        int bmi = service.calculate(weight, growth); // Индекс массы тела
        System.out.println((weight) + " масса тела, кг");
        System.out.println((growth) + "рост, м");
        System.out.println((bmi) + "Индекс массы тела");

    }
}