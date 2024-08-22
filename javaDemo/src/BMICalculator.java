public class BMICalculator {
    public static void main(String[] args) {
        // BMI = weight(in kg) / height (in meteres) * height (in meters)

        double weight = 57;
        double heigth = 5.3 * 12;

        // convert height to meters
        double heightInMeters = heigth * 0.0254;

        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.println(bmi);


    }
}
