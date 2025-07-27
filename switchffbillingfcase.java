import java.util.Scanner;

public class switchffbillingfcase {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int choice;
        int total=0;
        System.out.println("1.pizza-Rs.150");
        System.out.println("2.burger-Rs. 100");
        System.out.println("3.cake-Rs. 50");
        System.out.println("4.exit");
        do {
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:total+= 150;break;
                case 2:total+=100;break;
                case 3:total+=50;break;
                case 4:break;
                default:
                    System.out.println("Invalid Choice<4");
            }
        }while (choice<4);
        System.out.println("Total bill:Rs."+total);
    }

}
