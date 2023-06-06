public class BmiService {
    public int calculate(int weightkilo, double heightM) {
        double heightSquared;
        heightSquared = heightM * heightM;

        double BodyMassIndex = weightkilo / heightSquared;
        return (int) BodyMassIndex;
    }
}
