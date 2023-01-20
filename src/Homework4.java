public class Homework4 {
    public static void main(String[] args) {
        String str = "Hello world";
        String newStr = "";

        int index = 0;
        while (index < str.length()){
            char x = str.charAt(index);
            if(x == 'o'){
                newStr+=0;
            }else{
                newStr+=x;
            }
            index++;
        }
        System.out.println(newStr);
    }
}
