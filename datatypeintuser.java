import java.util.Scanner;

public class datatypeintuser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int value= sc.nextInt();
        System.out.println("enter the secound number:");
        int value1= sc.nextInt();
        int sum=value+value1;
        System.out.println("sum of"+ value +"and"+ value1 +"is"+ sum);
    }
}
