public class MyArray {
    public static void main(String[] args) {
        String[] students = {"Nemanja", "John", "Maria"};
        int [] numbers = {1, 2, 3};
        System.out.println(numbers[2]);

        int [] number = new int [5];
        for(int i= 0; i < 5; i++ ){
            number[i] = i;
            System.out.println(number[i]);
        }

        numbers [2] = 6;
        System.out.println(numbers[2]);

        for (int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers[i]);
        }

        System.out.println("There are: " + students.length + " students " + ", and the best student is: " + students[1]);
    }
}
