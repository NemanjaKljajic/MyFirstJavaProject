public class ForLoop {
    public static void main(String[] args) {
        int pages = 12;
        for (int i = 1; i <= pages; i++){
            System.out.println(i);
        }

        String [] students = {"Dmitry", "Nemanja", "Nemanja"};
        for(int i = 0; i < students.length;i++){
            if (students[1]== "Nemanja"){
                System.out.println("Ok");
                break;
            }
        }
        System.out.println("There is no such a thing");

        for (String student: students){
            System.out.println(student);
        }
        do {
            if(pages == 13){
                System.out.println("Ok");
                //pages++;
                continue;
            }
            System.out.println(pages);
            pages++;
        }while(pages < 20);
    }
}
