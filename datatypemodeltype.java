public class datatypemodeltype {
    public static void main(String[]args) {
        int value = 100;
        double value1 =  value;
        System.out.println("widening casting:");
        System.out.println("integer value:"+value);
        System.out.println("double value:"+value1);
        double value2=99.99;
        int value3= (int) value2;
        System.out.println("narrowing costing:");
        System.out.println("double value:"+value2);
        System.out.println("integer value:"+value3);
        char latter='A';
        int asciiValue=latter;
        System.out.println("char to int costing:");
        System.out.println("char later:"+latter);
        System.out.println("asciiValue:"+asciiValue);

    }
}
