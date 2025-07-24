import java.util.Scanner;

public class arraycountnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {4, 6, 4, 7, 4, 9, 4, 1};
        int count = 0;

        System.out.print("Enter the number to count: ");
        int num = sc.nextInt();

        for (int value : arr) {
            if (value == num)
                count++;
        }

        System.out.println(num + " appears " + count + " times.");
    }
}
