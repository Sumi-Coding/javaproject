public class studentMarksList {
    public static void main(String[] args){
        String studentName="Arun";
        double tamil=87.5;
        double english=92.8;
        double maths=78.4;
        double total=tamil+english+maths;
        double avg=total/3;
        int finalGrade=(int)avg;
        System.out.println("=====Student mark report ===");
        System.out.println("tamil mark:"+tamil);
        System.out.println("english mark:"+english);
        System.out.println("maths mark:"+maths);
        System.out.println("total mark:"+total);
        System.out.println("average mark:"+avg);
        System.out.println("final Grade:"+finalGrade);
    }
}
