public class arraymarksstatement {
    public static void main(String[] args) {
        int[] marks = {78, 90, 65, 54, 36};
        int highest = marks[0];
        int lowest = marks[0];
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
            if (marks[i] >= highest) {
                highest = marks[i];
            } else if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        System.out.println("the highest marks:" + highest);
        System.out.println("the lowest marks :" + lowest);
        double average = (total) / 5.0;

        System.out.println("the marks average" + average);
    }
}