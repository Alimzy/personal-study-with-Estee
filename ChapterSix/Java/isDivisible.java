import java.util.Scanner;

public class isDivisble{
public static void main(String... args){
Scanner input = new Scanner(System.in);

for(int counter =1; counter <= 10; counter++){
System.out.println("Enter an integer: ");
int number = input.nextInt();

boolean check = isDivisible(number);

System.out.println(check);

}


}

public static boolean isDivisible(int number){
if(number % 5 == 0){
return true;
}

return false;
}


}
