public class costingbankintersl {
    public static void main(String[] args){
        String costomar="ravi";
        double principal=10000.75;
        double rate=7.5;
        int year=3;
        double interest=(principal*rate*year);
        double totalamount=principal+interest;
        double payableamount=(int)totalamount;
        System.out.println("===bank interest summary===");
        System.out.println("customer:"+costomar);
        System.out.println("principal:"+principal);
        System.out.println("interst:"+interest);
        System.out.println("total:"+totalamount);
        System.out.println("payable:"+payableamount);

    }
}
