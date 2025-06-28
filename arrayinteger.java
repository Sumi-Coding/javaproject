public class arrayinteger {
    public static void main(String[] args) {
        double value[] = new double[5];
        int age[] = {12, 23, 34, 45, 55};

        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];

        }
        double average = (double) sum / age.length;
        System.out.println("the average is" + average);
    }
}

