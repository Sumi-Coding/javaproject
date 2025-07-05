import java.io.StringBufferInputStream;
import java.util.Scanner;

public class upparlowerr {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string ");
        String input=scanner.nextLine();
        String upper=input.toUpperCase();
        String lower =input.toLowerCase();
        System.out.println("the uppercase:"+upper);
        System.out.println("the lower:"+lower);
    }
}
