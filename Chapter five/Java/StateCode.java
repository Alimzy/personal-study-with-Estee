import java.util.Scanner;
public class StateCode{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter state code in Capital letter: ");
String code = input.nextLine();


System.out.println(checkStateCode(code));
}

public static String checkStateCode(String code){
if(code.equals("CT") || code.equals("MA") || code.equals("ME") || code.equals("NH") || code.equals("NJ") || code.equals("NY") || code.equals("PA") || code.equals("VT")){
return "State code is valid!!!";
}else
return "State code is incorrect!!! ";

}

}
