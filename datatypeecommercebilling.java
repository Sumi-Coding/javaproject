public class datatypeecommercebilling {
    public static void main(String[] args){
        double itemPrice=49.99;
        int quantity=3;
        double totalCost=itemPrice*quantity;
        int payableAmount=(int)totalCost;
        System.out.println("===E-Commerce Billing summary===");
        System.out.println("ItemPrice:$"+itemPrice);
        System.out.println("Quantity:"+quantity);
        System.out.println("TotalCost:$"+totalCost);
        System.out.println("Payable Amount:$"+payableAmount+"(rounded down)");
    }
}
