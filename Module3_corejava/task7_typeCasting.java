
public class task7_typeCasting {

    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;  // casting double to int

        int anotherInt = 42;
        double anotherDouble = (double) anotherInt;  // casting int to double

        System.out.println("Double value: " + myDouble);
        System.out.println("Double cast to int: " + myInt);
        System.out.println("Int value: " + anotherInt);
        System.out.println("Int cast to double: " + anotherDouble);
    }
}
