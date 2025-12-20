import java.util.Scanner;

public class ParkingCharge{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the number of customer we have for the day? ");
int numberOfCustomer = input.nextInt();

double totalAmount = 0;

for(int count = 1; count <= numberOfCustomer; count++){



System.out.println("Enter the number of hours each customer use: ");
int numberOfHour = input.nextInt();
double charge = calculateCharge(numberOfHour);
System.out.println("customer " + count + "charge  is: " + charge );
totalAmount += charge;


}
System.out.println("Total amount for the day is: " + totalAmount);


}

public static double calculateCharge(int hour){

double charges = 0;

if(hour <= 3){

charges = 2.00;

}else if(hour > 3){

charges = 2.00 + ((hour - 3) * 0.50);
}

return charges;

}

}
