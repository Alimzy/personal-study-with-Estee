import java.util.Scanner;

public class StudentGrade{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int gradeA = 0;
int gradeB = 0;
int gradeC = 0;
int gradeD = 0;


for(int counter =1;counter <= 5; counter++){

System.out.println("Enter student name: ");
String name = input.nextLine();

System.out.println("Enter student grade: ");
String grade = input.nextLine().toUpperCase();


switch(grade){
case "A":     
gradeA+=1;
break;

case "B":    
gradeB+=1;
break;

case "C":
gradeC+=1;
break;

case "D":
gradeD+=1;
break;
}
}

System.out.println(gradeA + " students bag the 'A' grade");
System.out.println(gradeB + " students bag the 'B' grade");
System.out.println(gradeC + " students bag the 'C' grade");
System.out.println(gradeD + " students bag the 'D' grade");

}


}
