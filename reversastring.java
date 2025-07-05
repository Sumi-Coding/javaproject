import java.util.Scanner;

public class reversastring {
    public static void main(String[] args){
        Scanner scannar=new Scanner(System.in);
        System .out.println("enter the name");
        String input= scannar.nextLine();
        String reversed="";
        for(int i =input.length()-1;i>=0;i--){
            reversed+=input.charAt(i);
        }
        System.out.println("reversed String:"+reversed);
    }
}
