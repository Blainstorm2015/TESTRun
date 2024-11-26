public class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        test();
        int a = 5;
        int b = 10;

        System.out.println("The sum of " + a + " and " + b + " is " + add(a, b));

        System.out.println("The difference of " + a + " and " + b + " is " + subtract(a, b));

        System.out.println("The product of " + a + " and " + b + " is " + multiply(a, b));
    }
        

    public static void test() {
        System.out.println("Hello World!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

}
