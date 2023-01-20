public class IfElseDemo {
    public static void main(String[] args) {
        int x = 7;

        if (x == 7){
            System.out.println(x + ", is equal to 7");
        }else if (x > 7){
            System.out.println("This is true");
        }else {
            System.out.println("Print this row");
        }

        int time = 1900;
        boolean cold = false;

        if (time < 1200){
            System.out.println("Good morning");
        }else if (time >= 1200 && time < 1800){
            System.out.println("Good afternoon");
        }else {
            if (cold){
                System.out.println("It is cold outside");
            }else if ( time < 2000 && time > 1800){
                System.out.println("Good evening");
            }else {
                System.out.println("Good warm evening");
            }

        }
    }
}
