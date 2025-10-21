import java.util.Scanner;

public class catchingmultiple {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = "Java";

            try {
                System.out.print("Enter numerator: ");
                int a = sc.nextInt();
                System.out.print("Enter denominator: ");
                int b = sc.nextInt();
                int result = a / b;
                System.out.println("Division result: " + result);

                System.out.print("Enter index to access string: ");
                int i = sc.nextInt();
                System.out.println("Character: " + str.charAt(i));

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String index error: " + e.getMessage());
            }
        }
    }


