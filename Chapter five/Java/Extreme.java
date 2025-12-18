import java.util.Scanner;

public class Extreme{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("How many values do you want to input: ");
int value  = input.nextInt();

System.out.println("Enter integer: ");
int numbers  = input.nextInt();

int maximum = numbers;
int minimum = numbers;

for(int counter = 1;counter < value;counter++){

System.out.println("Enter integer: ");
numbers  = input.nextInt();


if(numbers > maximum){

maximum = numbers;

}

if(numbers < minimum){

minimum = numbers;

}

}

int sum = maximum + minimum;

System.out.println("The sum of maximum and minimum  number is: " + sum);


}

}
