import java.util.Scanner;

public class isMultiple{
public static void main(String... args){
Scanner input = new Scanner(System.in);

for(int counter =1; counter <= 5; counter++){
System.out.println("Enter integer One: ");
int numberOne = input.nextInt();

System.out.println("Enter integer One: ");
int numberTwo = input.nextInt();

boolean result = isMultiple(numberOne, numberTwo);

System.out.println(result);

}


}
public static boolean isMultiple(int numberOne, int numberTwo){
if(numberOne % numberTwo == 0){

return true;
}

return false;

}

}
