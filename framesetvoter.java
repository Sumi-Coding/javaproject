import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class framesetvoter {
    public static void main(String[] args) {
       Set<String> voters = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter voter name (or type 'exit' to stop): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            if (voters.contains(name)) {
                System.out.println(name + " has already voted.");
            } else {
                voters.add(name);
                System.out.println("Vote recorded for " + name + ".");
            }
        }

        System.out.println("\nAll voters:");
        for (String voter : voters) {
            System.out.println(voter);
        }

        scanner.close();
    }
}


