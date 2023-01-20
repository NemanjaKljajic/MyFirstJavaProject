public class JavaMethods {
    public static void main(String[] args) {
        myName();
        printHello("Nemanjaaa");
        nameAndAge("Nemanja", 35);
        printHello("Nemanja", 45);
    }
    private static void myName(){
        System.out.println("Hello Nemanja");
    }

    private static void nameAndAge(String name, int a){
        System.out.println(name + " is: " + a + " years old");
    }

    private static void printHello(String name){
        System.out.println("Hello" + name);
    }

    private static void printHello(String name, int a){
        System.out.println(name + a);
    }
}
