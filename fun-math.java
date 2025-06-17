public class MathFunction {
    public static void main(String[] args) {
        double number = 49.0;

        double sqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + sqrt);

        double power = Math.pow(number, 2);
        System.out.println(number + " raised to the power 2 is " + power);

        double radians = Math.toRadians(40);
        double sine = Math.sin(radians);
        System.out.println("Sine of 40 degrees is " + sine);

        double negative = -13;
        double absValue = Math.abs(negative);
        System.out.println("Absolute value of " + negative + " is " + absValue);

        double max = Math.max(10, 35);
        System.out.println("Maximum of 10 and 35 is " + max);

        double min = Math.min(250, 305);
        System.out.println("Minimum of 250 and 305 is " + min);

        double random = Math.random();
        System.out.println("Random number: " + random);
    }
}
