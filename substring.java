import java.util.Scanner;

public class substring {
    public static void main(String[] args){
        Scanner scannar=new Scanner(System.in);
        System.out.println("enter the string");
        String input=scannar.nextLine();
        System.out.println("enter the min string");
        String minstring=scannar.nextLine();
        System.out.println("enter the substring");
        String substring=scannar.nextLine();
        if(minstring.contains(substring)){
            System.out.println("the string is substring");
        }
        else{
            System.out.println("the string is not substring");
        }
    }
}
