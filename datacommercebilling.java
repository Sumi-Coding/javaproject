import java.util.Scanner;

public class datacommercebilling {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the product:");
        String product= sc.nextLine();
        System.out.println("enter the quality:");
        double quality=sc.nextDouble();
        System.out.println("product price:");
        double price=sc.nextDouble();
        double totalCost=quality*price;
        double payabuleAmount=(int)totalCost;
        System.out.println("the totalCost:"+totalCost);
        System.out.println("the payabuleAmount"+payabuleAmount);

    }
}
