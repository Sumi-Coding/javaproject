
     class employee{
        String name;
        int age;
        double salary;
        void displayDetails(){
            System.out.println("Name:"+name);
            System.out.println("age:"+age);
            System.out.println("salary:"+salary);
        }

         public void LunchBreak() {
         }

         public void Work() {
         }
     }
    public class constructor{
        public static void main(String[] args) {
            employee emp1 = new employee();
            emp1.name = "sumi";
            emp1.age = 22;
            emp1.salary = 30000;
            employee emp2 = new employee();
            emp2.name = "abi";
            emp2.age = 25;
            emp2.salary = 40000;
            employee emp3 = new employee();
            System.out.println("employee1:");
            emp1.displayDetails();
            System.out.println("\nemployee2:");
            emp2.displayDetails();
        }
    }

