import java.util.Scanner;

public class twostringequal {
    public static void main(String[] args){
        Scanner scannar=new Scanner(System.in);
        System.out.println("enter the string");
        String input= scannar.nextLine();
        System.out.println("enter the string1");
        String input1=scannar.nextLine();
        if( input.equals(input1)){
            System.out.println("the string are equal");
        }
        else{
            System.out.println("the string are not equal");
        }
    }
}
