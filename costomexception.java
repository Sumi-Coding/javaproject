 class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg){
        super(msg);
    }
}
public class costomexception{
    public static void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            System.out.println("Not eligible to vote");
        }
    }
    public  static void main(String[] args){
            try{
                validateAge(15);
            }
            catch (InvalidAgeException e){
                System.out.println("Exception caught:"+e.getMessage());
            }
        }
}