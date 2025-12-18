import java. util.Scanner;

public class TwelveDaysOfChristmas{
public static void main(String[] args){

System.out.println(christmasSong());

}



public static boolean christmasSong(){
Scanner input = new Scanner(System.in);

boolean count = true;
while(count){


System.out.println(" Welcome to the best App for the Lyrics of the song 'Twelve Days Of Christmas' ");

String menu = """

1. First Day
2. Second Day
3. Third Day
4. Fourth Day
5. Fifth Day
6. Sixth Day
7. Seventh Day
8. Eighth Day
9. Ninth Day
10. Tenth Day
11. Eleventh Day
12. Twelfth Day
0. Exit program

""";
System.out.println(menu);

System.out.println("Enter an options sir/ma: ");
int menuCase = input.nextInt();


switch(menuCase){
    case 1->{

    String firstDay = """

    On the first day of Christmas
    my true love sent to me
    

    """;
   System.out.println(firstDay);

}


    case 2->{
    String secondDay = """

    On the second day of Christmas,
    my true love sent to me
    
    """;
    System.out.println(secondDay);
}


    case 3->{
    String thirdDay = """

    On the third day of Christmas,
    my true love sent to me
    
    """;
    System.out.println(thirdDay);
}

    case 4->{
    String fourthDay = """

    On the fourth day of Christmas,
    my true love sent to me
    

    """;
    System.out.println(fourthDay);

}

    case 5->{
    String fifthDay = """

    On the fifth day of Christmas,
    my true love sent to me
    

    """;
    System.out.println(fifthDay);

}

    case 6->{
    String sixthDay = """

    On the sixth day of Christmas,
    my true love sent to me
    

    """;
    System.out.println(sixthDay);

}

    case 7->{
    String seventhDay = """

    On the seventh day of Christmas,
    my true love sent to me
    

    """;
System.out.println(seventhDay);


}

    case 8->{
    String eightDay = """

    On the eighth day of Christmas,
    my true love sent to me
  
    """;
    System.out.println(eightDay);

}

    case 9->{
    String ninethDay = """

    On the ninth day of Christmas,
    my true love sent to me
  
    """;

    System.out.println(ninethDay);

    }
    case 10 ->{
    String tenthDay = """

    On the tenth day of Christmas,
    my true love sent to me
    

    """;
    System.out.println(tenthDay);
}

    case 11 ->{
    String eleventhDay = """
    
    On the eleventh day of Christmas,
    my true love sent to me

    """;
    System.out.println(eleventhDay);


}

    case 12->{

      
    String twelfthDay = """

    On the twelfth day of Christmas,
    my true love sent to me


    """;

    System.out.println(twelfthDay);
}

    case 0->{
    count = false;
    break;
    }

}


switch(menuCase){
    case 1->{

    String firstDay = """
   
    A partridge in a pear tree

    """;
   System.out.println(firstDay);

}


    case 2->{
    String secondDay = """
    
    Two turtle doves,
    And a partridge in a pear tree.

    """;
    System.out.println(secondDay);
}


    case 3->{
    String thirdDay = """
   
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;
    System.out.println(thirdDay);
}

    case 4->{
    String fourthDay = """

    
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;
    System.out.println(fourthDay);

}

    case 5->{
    String fifthDay = """
   
    Five gold rings,
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;
    System.out.println(fifthDay);

}

    case 6->{
    String sixthDay = """

    
    Six geese a-laying,
    Five gold rings,
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;
    System.out.println(sixthDay);

}

    case 7->{
    String seventhDay = """
 
    Seven swans a-swimming,
    Six geese a-laying,
    Five gold rings,
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;
System.out.println(seventhDay);


}

    case 8->{
    String eightDay = """

    
    Eight maids a-milking,
    Seven swans a-swimming,
    Six geese a-laying,
    Five gold rings,
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;
    System.out.println(eightDay);

}

    case 9->{
    String ninethDay = """

    Nine ladies dancing,
    Eight maids a-milking,
    Seven swans a-swimming,
    Six geese a-laying,
    Five gold rings,
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;

    System.out.println(ninethDay);

    }
    case 10 ->{
    String tenthDay = """
  
    Ten lords a-leaping,
    Nine ladies dancing,
    Eight maids a-milking,
    Seven swans a-swimming,
    Six geese a-laying,
    Five gold rings,
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;
    System.out.println(tenthDay);
}

    case 11 ->{
    String eleventhDay = """
    
    Eleven pipers piping,
    Ten lords a-leaping,
    Nine ladies dancing,
    Eight maids a-milking,
    Seven swans a-swimming,
    Six geese a-laying,
    Five gold rings,
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree.

    """;
    System.out.println(eleventhDay);


}

    case 12->{

      
    String twelfthDay = """
    
    Twelve drummers drumming,
    Eleven pipers piping,
    Ten lords a-leaping,
    Nine ladies dancing,
    Eight maids a-milking,
    Seven swans a-swimming,
    Six geese a-laying,
    Five gold rings,
    Four calling birds,
    Three French hens,
    Two turtle doves,
    And a partridge in a pear tree!


    """;

    System.out.println(twelfthDay);
}

    case 0->{
    System.out.println("This is the end of the programme");

    break;
    }

}

}




return count;




}


}
