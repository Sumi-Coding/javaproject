import java.util.Scanner;

public class datatypeuserprint {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Quantity bought");
        int QuantityBought=scanner.nextInt();
        System.out.println("Enter your Price par");
        double PricePar=scanner.nextDouble();
        System.out.println("Enter your Amount paid");

        double AmountPaid=scanner.nextDouble();
        double DeliveryCharge=30.0;
        double TotalPrice=PricePar * QuantityBought;
        double TotalAmount=TotalPrice+DeliveryCharge;
        double BalanceReturn=AmountPaid-TotalAmount;

        System.out.println("TotalPrice:"+TotalPrice);
        System.out.println("TotalAmount:"+TotalAmount);
        System.out.println("BalanceReturn:"+BalanceReturn);







    }
}
