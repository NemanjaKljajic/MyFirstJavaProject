public class JavaExceptions {
    public static void main(String[] args) {
        String [] students ={"Nemanja", "John", "Tom"};
        try {
            System.out.println(students[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Check.checkAge(10);
    }

}

class Check{
    static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Access denied");
        }else {
            System.out.println("Access granted");
        }
    }
}
