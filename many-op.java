public class SimpleOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c;

        c = a + b;

        if(c > 7) {
            System.out.println("c is greater than 7");
        }

        a++;
        b--;

        if(a == 10 && b < 3) {
            System.out.println("a is 10 and b is less than 3");
        }
    }
}
