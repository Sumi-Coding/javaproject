
class animals{
        void sound(){
            System.out.println("the animal make sound");
        }
    }
    class Dog extends animals{
        void sound(){
            System.out.println("dog is sound");
        }
    }

public class methodoverriding {
public static void main(String[] args){
    animals a=new Dog();
    a.sound();
}
}