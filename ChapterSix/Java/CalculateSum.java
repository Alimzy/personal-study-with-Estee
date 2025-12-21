import java.util.Scanner;

public class CalculateSum{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.println("Enter an integer: ");
int number = input.nextInt();

if ( number < 999 && number > 9999){
System.out.println("Enter four digits number!");
}else{

int result = sumOf(number);


System.out.println(result);

}



}


public static int sumOf(int number){


int firstNumber = number / 1000;
int secondNumber = (number / 100) % 10;
int thirdNumber = (number / 10) % 10;
int fourthNumber = number % 10;

int sum = firstNumber + secondNumber + thirdNumber + fourthNumber; 

return sum;

}

}
