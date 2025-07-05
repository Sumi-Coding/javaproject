public class trimleading {
    public static void main(String[] args) {
        String input = "   Hello World   ";
        String trimmed = input.trim();

        System.out.println("Original: [" + input + "]");
        System.out.println("Trimmed:  [" + trimmed + "]");
    }
}


