import java.util.Scanner;

public class AirlineReservation{
public static void main(String... args){
Scanner input = new Scanner(System.in);

boolean[] firstClass = {false, false,false, false,false};
boolean[] economy = {false, false,false, false,false};

System.out.println("Welcome t Alimzy Airline");
String menu = """
These are the available flight type
1. First Class
2. Economy
""";

System.out.println(menu);


System.out.println("Please type 1 for First Class and Please type 2 for Economy:");
int userInput  = input.nextInt();


if(userInput == 1){
for(int counter = 0; counter < firstClass.length);counter++){
if(firstClass[counter] == false){
fitstClass[counter] = true;
System.out.println("You have beem assign to a first class seat with the seat number " + (counter + 1));
break;

}else if(firstClass[counter] != false){
System.out.println("All first class seat is full, would you like an economy seat?(yes/no)");
String confirmDescision = input.nextLine().lower();
if(confirmDescision.equals(yes)){
economy[counter] = true;
System.out.println("You have beem assign to a economy class seat with the seat number " + (counter + 1));
}else if(confirmDescision.equals(no)){
System.out.println("Next flight leaves in 3 hours.");
}
}

}


}else if(userInput = 2){
for(int counter = 0; counter < firstClass.length;counter++){
if(economy[counter] == false){
economy[counter] = true;
System.out.println("You have beem assign to a economy class seat with the seat number " + (counter + 1));
break;

}else if(economy[counter] != false){
System.out.println("All first class seat is full, would you like an economy seat?(yes/no)");
String confirmDescisionTwo = input.nextLine().lower();
if(confirmDescisionTwo.equals(yes)){
firstClass[counter] = true;
System.out.println("You have beem assign to a economy class seat with the seat number " + (counter + 1));
}else if(confirmDescisionTwo.equals(no)){
System.out.println("Next flight leaves in 3 hours.");
}

}


}else{
System.out.println("invalid input!");
}



}
}
