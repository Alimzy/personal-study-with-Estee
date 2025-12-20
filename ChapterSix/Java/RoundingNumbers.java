import java.util.Scanner;


public class RoundingNumbers{
public static void main(String... args){
Scanner input = new Scanner(System.in);


while(true){

System.out.println("Enter a value: ");
double number = input.nextDouble();


double roundNumber = Math.floor(number);
System.out.println("Original number is " + number);
System.out.println("RoundNumber is " + roundNumber);


if(number ==0){

break;
}
}

}


}
