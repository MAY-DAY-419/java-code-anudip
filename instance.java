public class Instance {
    public static void main(String[] args) {
        Integer num = 1000;
        boolean result;

        result = num instanceof Integer;
        System.out.println("Is num an instance of Integer? " + result);
    }
}
