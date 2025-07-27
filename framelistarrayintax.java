import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class framelistarrayintax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Grapes");
        int index = scanner.nextInt();
        System.out.println("Enter an index:" + index);
        if (index >= 0 && index < fruit.size()) {
            System.out.println("items at index: " + index + "fruit: " + fruit.get(index));

        }
    }
}
