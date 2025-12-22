import java.util.Scanner;

public class SportCelsius{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.println("Enter your temperature: ");
int number = input.nextInt();

String result = sportsRecommender(number);

System.out.println(result);
}

public static String sportsRecommender(int number){
if(number >= 20 && number <= 30){

return "It’s lovely weather for sports today!";

}else if(number >= 10 && number <= 40){

return "It’s reasonable weather for sports today";
}
return "Please exercise with care today, watch out for the weather!";
}

}
