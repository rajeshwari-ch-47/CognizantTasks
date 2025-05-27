
public class t12_methodoverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Add two ints: " + add(3, 4));
        System.out.println("Add two doubles: " + add(2.5, 4.3));
        System.out.println("Add three ints: " + add(1, 2, 3));
    }
}
