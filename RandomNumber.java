import java.util.Scanner;
import java.util.Random;

public class RandomNumber{
 public static void main(String[] args){
Scanner input = new Scanner(System.in);


 System.out.println("Guess a number");
 int number = input.nextInt();
 
 Random randomNumber = new Random();
int randomGuess = input.nextInt();

 int counter = 0;

 while(number != randomGuess){
 if(number < randomGuess){
 System.out.println("Too low, try again");
}else if(number > randomGuess){
System.out.println("too high, try again");
}else{
System.out.println("You guess right");
}
counter++;

}


}
}
