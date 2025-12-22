public class PerfectNumber{
public static void main(String... args){
for(int count = 1; count <= 1000;count++){


}

//System.out.println(perfectNumbers(9));
}

public static int perfectNumbers(int number){

int sum = 0;

for(int counter = 1; counter < number; counter++){
if(counter % number == 0){

sum+= counter;
}

}
if(sum ==  number){
return true;

}
return false;

}
}
