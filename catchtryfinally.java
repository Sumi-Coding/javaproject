public class catchtryfinally {
    public static void main(String[] args){
        try{
        int result=10/0;
        }
        catch (ArithmeticException e){
            System.out.println("can not divide by zero");
        }
        finally{
            System.out.println("finally block executed");
        }

    }
}
