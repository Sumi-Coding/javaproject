public class abstactionwithabstract {
    abstract class Animal {
        abstract void sound();
    }

    static class Dog extends animal{
        void sound() {
            System.out.println("Barks");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog obj = new Dog();
            obj.sound();
        }
    }

}
