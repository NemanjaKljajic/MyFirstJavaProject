public class Homework1 {
    public static void main(String[] args) {
        int x = 23;

        if (x <= 10){
            if (x < 0){
                System.out.println("Negative");
            }else if (x == 0){
                System.out.println("Zero");
            }else{
                System.out.println("Small");
            }
        }else if (x < 100 && x!=23){
            System.out.println("Less than 100");
        }else {
            if (x >= 100){
                System.out.println("Too big");
            }else {

                System.out.println("Jordan");

            }
        }

        if (x < 0){
            System.out.println("Negative");
        }else if (x == 0){
            System.out.println("Zero");
        }else if ( x <=10){
            System.out.println("Small");
        }else if(x < 100 && x != 23){
            System.out.println("Less than 100");
        }else if( x >= 100){
            System.out.println("Too Big");
        }else {
            System.out.println("Jordan");
        }

    }
}
