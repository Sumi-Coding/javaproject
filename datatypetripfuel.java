import java.util.Scanner;

public class datatypetripfuel {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your total Distance");
        double totalDistance=scanner.nextDouble();
        System.out.println("Enter your Millage");
        double Mileage=scanner.nextDouble();
        System.out.println("Enter your Passengers");
        int passengers=scanner.nextInt();
        double FuelPricePerLiter=105.75;
        double budgetperperson=1000;
        double FuelNeeded= totalDistance / Mileage;
         double TotalFuelCost=FuelNeeded * FuelPricePerLiter;
         double CostPerPerson=TotalFuelCost / passengers;
         double remaining=budgetperperson - CostPerPerson;
         System.out.println("FuelNeeded:"+FuelNeeded);
         System.out.println("TotalFuelCost:"+TotalFuelCost);
         System.out.println("CostPerPerson:"+CostPerPerson);
         System.out.println("remaining:"+remaining);

    }
}
