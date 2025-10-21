public class catchmultipule {
    public static void main(String[] args){
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        }
        catch (NullPointerException e){
            System.out.println(" null pointer exception ");
        }

    }
}
