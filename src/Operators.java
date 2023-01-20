public class Operators {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        a += 54;

        System.out.println(a + b);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(--b);

        System.out.println(a < b && b > a);
        System.out.println(a < b || b < a);
        System.out.println(a != b);
    }
}
