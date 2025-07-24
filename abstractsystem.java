abstract class Studentdetails{
    abstract void result();
}
class student extends Studentdetails {
    private String name;
    private int rollno;
    private int mark1, mark2, mark3;


    public student() {
    }

    public student(String name, int rollno, int m1, int m2, int m3) {
        this.name = name;
        this.rollno = rollno;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setMark(int m1, int m2, int m3) {
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    public int getTotalMarks() {
        return mark1 + mark2 + mark3;
    }

    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg <= 270)
            return "A";

        else if (avg <= 240)
           return "B";
            else if (avg <= 200)
                return "C";
            else if (avg <= 150)
                return "D";
            else
                return "Fail";


}
    public void result(){
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+rollno);
        System.out.println("Mark:"+mark1+","+mark2+","+mark3);
        System.out.println("TotalMars:"+getTotalMarks());
        System.out.println("Avg marks:"+getAverage());
        System.out.println("grade:"+getGrade());

    }
}

public class abstractsystem {
    public static void main(String[] args){
        student stus=new student("sumi",101, 45,32,78);
        stus.setRollno(101);
        stus.setMark(45,32,78);

    }
}
