public class typecostingshoppingbill {
    public static void main(String[] args){
        double shirt= 799.75;
        double jeans=1299.50;
        double shoes=999.99;
        double totalbill=shirt+jeans+shoes;
        int payableAmount=(int)totalbill;
        System.out.println("===Sopping bill summary===");
        System.out.println("shirt price:"+shirt);
        System.out.println("jeans price:"+jeans);
        System.out.println("total bill:"+totalbill);
        System.out.println("payable amount:"+payableAmount);

    }
}
