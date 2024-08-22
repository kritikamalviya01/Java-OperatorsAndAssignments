public class AssignmentOperator {
    public static void main(String[] args) {
        // First way to Assign
        int a = 10;

        // Second way
        int x, b, c;
        x = b = c = 1000;
        System.out.println(x);
        System.out.println(b);
        System.out.println(c);

        // Compound Assignment
        int i = 10;
        i += 20; // i = i+20 -> 10 + 20 -> 30
        System.out.println(i);
    }
}
