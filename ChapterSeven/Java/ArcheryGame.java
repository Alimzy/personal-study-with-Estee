import java.security.SecureRandom;

public class ArcheryGame{
public static void main(String[] args){
SecureRandom randomNumbers = new SecureRandom();
int total = 0;
int[][] scores = new int[3][3];

for(int players = 0; players < scores.length; players++){
for(int chance = 0;chance < scores[players].length; chance++){
scores[players][chance] = randomNumbers.nextInt(10) + 1;
}

}

System.out.printf("%s%15s%15s%15s%15s\n","Players","Chance One","Chance Two","Chance Three","Total");

for(int counter = 0; counter < scores.length; counter++){
System.out.printf("%d\n", counter+1);

for(int count =0;count < scores[counter].length; count++){

System.out.printf("%15d",scores[counter][count]);
total += scores[counter][count];

}

System.out.printf("%20d\n",total);
}

}
}
