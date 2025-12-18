public class SumOfSeries{

public static void main(String[] args){

int sum = 0;

System.out.printf("%-15s %-10s%n", "number", "sum" );

for(long counter = 1; counter <= 100; counter++){

sum+= counter;


System.out.printf("%-15s %-10s%n", counter, sum );




}

}


}
