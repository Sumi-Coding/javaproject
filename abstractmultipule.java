public class abstractmultipule {
    abstract class Employee {
        abstract void work();
        void lunchBreak() {
            System.out.println("Taking lunch break");
        }
    }

    static class Developer extends Employee {
        void work() {
            System.out.println("Developing software");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Employee e = new Employee();
            e.work();
            e.lunchBreak();
        }
    }
}
