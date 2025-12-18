
public class CompoundInterest{
public static void main(String[] args){

double principal = 1000.0;



for(int interest = 5; interest <= 10;interest++){

double interestConversion = interest / 100.0;

System.out.println("This is compound interest for " + interest + " rate");

System.out.printf("%s%20s%n", "Year", "Amount on deposit");
for (int year = 1; year <= 10;year++) {

double amount = principal * Math.pow(1.0 + interestConversion, year);

System.out.printf("%4d%,20.2f%n", year, amount);
}

}




}
}
