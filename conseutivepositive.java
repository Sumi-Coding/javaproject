public class conseutivepositive {
    public static void main(String[] args) {

        int N = 15;
        for (int i = 1; i < N; i++) {
            int sum = 0;
            for (int j= i; j < N;j++) {
                sum += j;
                if (sum == N) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                    break;
                }
                if (sum > N) {
                    break;
                }
            }
        }
    }
}