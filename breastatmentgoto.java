public class breastatmentgoto {
    public static void main(String[] args) {
        label_1:
        {
            label_2:
            {
                label_3:
                {
                    for (int i = 0; i < 100; i++) {
                        System.out.println("inside label_3");
                        if (i==3) {
                            break label_3;
                        }
                    }
                }
                System.out.println("inside label_2");
            }
            System.out.println("inside label_1");

        }
    }
}




