public class abstactionwithabstractshope {
    abstract class Shape {
        abstract void draw();
    }

    static class Circle extends shape {
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Circle s = new Circle();
            s.draw();
        }
    }

}
