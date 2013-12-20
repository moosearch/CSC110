// Wesley Chow // V00727646
// CSC 110 // June 15, 2012
// CFCalculator (Assignment 4)
/* This program calculates one's carbon footprint over a year*/

//import library containing scanner
import java.util.*;

public class CFCalculator{

  //Do calculations for each category in static methods that return values, then use a void method for conclusion
  public static void main(String [] arg){
    System.out.println("This is a program that estimates your carbon footprint over 1 year.\n");
    double x = determineTransportationEmission();
    System.out.println(); //space in between sections
    double y = determineElectricityEmission();
    System.out.println();
    double z = determineFoodEmission();
    System.out.println();
    double TotalEmission = calculateTotalEmission(x,y,z); //sums up car&elect&food, then converts it to metric tons
    printReport(TotalEmission, x, y, z); //conclusion
  }

  //Transport emission
  public static double determineTransportationEmission(){
    Scanner stdin = new Scanner(System.in); //set scanner in static method
    System.out.println("Section 1: TRANSPORTATION"); //subheader
    System.out.print("The average number of kilometres you drive in a day (Put 0 if you don't drive): ");
    double kmPerDay = stdin.nextDouble();
    if(kmPerDay <= 0){ //if input is less than or equal to zero, returns a value of zero
      return 0.0;
    }
    System.out.print("Average gas mileage on your vehicle in km/L: ");
    double fuelEfficiency = stdin.nextDouble();
    if(fuelEfficiency <= 0){ //avoid division by zero and negative values
      return 0;
    }
    double litresUsedPerYear = 365*(kmPerDay/fuelEfficiency);
    double kgCO2 = 2.3*litresUsedPerYear; //formula for calculating CO2 emission for transport
    return kgCO2; //return value to main method
  }

  //Electricity emission
  public static double determineElectricityEmission(){
    Scanner stdin = new Scanner(System.in); //set scanner in static method
    System.out.println("Section 2: ELECTRICITY USE");
    System.out.print("Average amount of electricity used per month in kWh in your residence (700 is a modest guess if you don't know): ");
    double kWhPerMonth = stdin.nextDouble();
    if(kWhPerMonth <= 0){ //if a value less than zero is entered, it will return a value of zero
      return 0;
    }
    System.out.print("Number of people living with you: ");
    double numPeopleInHome = stdin.nextDouble();
    if(numPeopleInHome <= 0){ //avoiding division by zero
      return 0;
    }
    double kgCO2 = (kWhPerMonth*12*0.257)/numPeopleInHome; //formula for calculating CO2 emission
    return kgCO2;
  }

  //Food emission
  public static double determineFoodEmission(){
    Scanner stdin = new Scanner(System.in);
    System.out.println("Section 3: FOOD CONSUMPTION");
    System.out.print("You will be breaking down your daily diet in terms of the following categories: ");
    System.out.println("Meat and fish; dairy; fruits and vegetables; and carbs.");
    System.out.println("*Omit the % sign when you enter your percentages");
    System.out.print("Percentage of meat and fish consumed in your daily diet: ");
    double meat = 53.1*stdin.nextDouble(); //formula for meat CO2 emission
    System.out.print("Percentage of dairy consumed in your daily diet: ");
    double dairy = 13.8*stdin.nextDouble(); //formula for dairy CO2 emission
    System.out.print("Percentage of fruits and vegetables consumed in your daily diet: ");
    double fruit = 7.6*stdin.nextDouble(); //formula for fruit/veg CO2 emission
    System.out.print("Percentage of carbs consumed in your daily diet: ");
    double carbs = 3.1*stdin.nextDouble(); //formula for carbs CO2 emission
    double kgCO2 = meat + dairy + fruit + carbs; //yearly kgCO2
    if(kgCO2 <= 0){ //if total value is negative or equal to zero, return a value of zero
      return 0;
    }
    return kgCO2;
  }

  //Combine the three categories' emissions together
  public static double calculateTotalEmission(double trans, double elec, double food){
    double CarbonFootprint = (trans + elec + food)/1000; //formula for total emission, answer is in metric tons
    CarbonFootprint = rounding(CarbonFootprint, 2);
    return CarbonFootprint;
  }

  //Static method that rounds values to whatever decimal place specified in decimal place
  public static double rounding(double value,double decimalplace){
    double f = Math.pow(10,decimalplace);
    value = value*f;
    value = Math.round(value); //rounds to the 1st decimal place
    return value = value/f; //as a result of dividing by f, you get your desired number of decimal places
  }

  //conclusion
  public static void printReport(double Total, double trans, double elect, double food){

    //I need total emissions in kilotons in order to calculate the percentage breakdown
    double kiloTotal= trans+elect+food;
    //round these values to 2 decimal places
    double percentTrans = rounding(trans/kiloTotal*100,2);
    double percentElect = rounding(elect/kiloTotal*100,2);
    double percentFood = rounding(food/kiloTotal*100,2);
    //start of conclusion output on console
    System.out.println("You produce an annual total of "+Total+" metric tons of CO2 per year.");
    System.out.println("The breakdown is as follows:");
    //tabulate them using \t and forming a simple table
    System.out.println("\tCar\t\t"+percentTrans+"%");
    System.out.println("\tElectricity\t"+percentElect+"%");
    System.out.println("\tFood\t\t"+percentFood+"%");
  }
}