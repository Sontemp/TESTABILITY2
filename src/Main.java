public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        int BodyMassIndex = service.calculate(60, 1.70);

        System.out.println("индекс массы тела: " + BodyMassIndex);
    }
}