import java.util.ArrayList;

public class PerfectNumber{
public static void main(String... args){



for(int count = 1; count <= 1000;count++){

//System.out.println(perfectNumbers(count));
int result = perfectNumbers(count);
//System.out.println(count);
if(result != 0){

//System.out.println(count);
System.out.println(result);
System.out.println(getFactors(result));
System.out.println();

}
//else{
//System.out.println("This is not a prime number!");
//}

}


}

public static int perfectNumbers(int number){

int sum = 0;

for(int counter = 1; counter < number; counter++){
if(number % counter == 0){

sum+= counter;
}

}
if(sum ==  number){
return number;

}
return 0;

}

public static ArrayList<Integer> getFactors(int number){

ArrayList<Integer> myArray = new ArrayList<>();
int sum = 0;

for(int counter = 1; counter < number; counter++){
if(number % counter == 0){

sum+= counter;
myArray.add(counter);
}

}
if(sum ==  number){
return myArray;


}
return myArray;


}
}
