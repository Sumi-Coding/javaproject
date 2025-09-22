public class costingelectricitybill {
    public static void main(String[] args){
        long mobno=9876543210L;
        double palnAmount=199.99;
        int payable=(int) palnAmount;
        System.out.println("===Mobile Recharge===");
        System.out.println("Mobile number:"+mobno);
        System.out.println("Plan Amount:"+palnAmount);
        System.out.println("payable(Rounded):"+payable);
    }
}
