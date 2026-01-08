import java.util.Scanner;

public class AirlineReservation{
public static void main(String... args){
Scanner input = new Scanner(System.in);

boolean[] firstClass = {true, true,true, true,true};
boolean[] economy = {false, false,false, false,false};

System.out.println("Welcome to Alimzy Airline");
String menu = """
These are the available flight type
1. First Class
2. Economy
""";

System.out.println(menu);


System.out.println("Please type 1 for First Class and Please type 2 for Economy:");
int userInput  = input.nextInt();
input.nextLine();


if(userInput == 1){
boolean checkFirstClassSeat = true;
for(int counter = 0; counter < firstClass.length;counter++){
if(firstClass[counter] == false){
firstClass[counter] = true;
checkFirstClassSeat = false;
System.out.println("You have beem assign to a first class seat with the seat number " + (counter + 1));
break;

}

}

if(checkFirstClassSeat == true){
System.out.println("All first class seat is full, would you like an economy seat?(yes/no)");
String confirmDescision = input.nextLine().toLowerCase();
if(confirmDescision.equals("yes")){
for(int counter = 0; counter < firstClass.length;counter++){
if(economy[counter] == false){
economy[counter] = true;
System.out.println("You have beem assign to a economy class seat with the seat number " + (counter + 1));
break;
}
}
}else if(confirmDescision.equals("no")){
System.out.println("Next flight leaves in 3 hours.");
}
}


}else if(userInput == 2){

boolean checkEconomySeat = true;
for(int counter = 0; counter < firstClass.length;counter++){
if(economy[counter] == false){
economy[counter] = true;
checkEconomySeat = false;
System.out.println("You have beem assign to a economy class seat with the seat number " + (counter + 1));
break;

}
}

if(checkEconomySeat == true){
System.out.println("All first class seat is full, would you like an economy seat?(yes/no)");
String confirmDescisionTwo = input.nextLine().toLowerCase();

if(confirmDescisionTwo.equals("yes")){
for(int counter = 0; counter < firstClass.length;counter++){
if(firstClass[counter] == false){
firstClass[counter] = true;
System.out.println("You have beem assign to a first class seat with the seat number " + (counter + 1));
break;

}
}
}else if(confirmDescisionTwo.equals("no")){
System.out.println("Next flight leaves in 3 hours.");
}
}

}else{
System.out.println("invalid input!");
}



}
}
