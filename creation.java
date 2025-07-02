public class creation {
    public void print(){
        System.out.println("my first java class");
    }
    public void addition(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        creation objectcreation = new creation();
        objectcreation.print();
        objectcreation.addition(105,670);
    }
}
