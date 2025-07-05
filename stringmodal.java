import java.util.Scanner;

public class stringmodal {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the name");
        String input= scanner.nextLine();
        int output=input.length();
        System.out.println("this name number :"+output);

    }
}
