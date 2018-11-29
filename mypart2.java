public class mypart2{
  public static void main(String[] args) {
    int count =0;
    System.out.println("Enter the difficulty level for the quiz  1-Easy  2-Medium 3-Difficult ");
    int input = TextIO.getlnInt();
    //Scanner input = in.nextLine();
    if (input==1){
      int easy = Easy(input);
    }  else if (input==2){
      int medium = intermediate(input);
    } else {
      int difficult = difficult(input);
  }

  public static int Easy(int input){
    int count =0;
    System.out.println(" How do you make a comment in java?");
    //a)/ /   b) /  c) comment*
    String ans1 = TextIO.getln();
    if(ans1 =="a"){
      System.out.println("Correct answer");
      count++;
      System.out.println("Your score is "+ count);
    } while (ans1!="a"){
      System.out.println("wrong answer. Try again");
      System.out.println(" How do you make a comment in java?");
      ans1 = TextIO.getln();
    }
    return count;
  }

  /**public static int intermediate (int input){
    int count = 0;
    System.out.println("In what format do you save a java file in order for it to run correctly?");
    System.out.println(" a] JAVA  b]java   c].java");
    String ans2 = TextIO.getln();
    if(ans2 =="c"){
      System.out.println("Correct answer");
      count++;
      System.out.println("your score is " + count);
    // break;
    } while(ans2!="c"){
    System.out.println("wrong answer. Try again");
    System.out.println("In what format do you save a java file in order for it to run correctly? /n a] JAVA  b]java   c].java ");
    ans2 = TextIO.getln();
  }
    return count;
}
public static int Difficult (int input){
  int count =0;
  System.out.println(" Q1. Command to execute a compiled java program is : A] javac    B]java     C] run    D] execute" );
  String Q1ans = TextIO.getln();
  if(Q1ans =="b"){
      count++;
      System.out.println("Correct answer!");
  }
  System.out.println("Q2. The java compiler  A] creates executable  B] translates java source to byte code   C] produce java interpreter D] creates classes");
  String Q2ans = TextIO.getln();
     if (Q2ans =="b"){
     count ++;
     System.out.println("Correct answer!");
   } else {
     System.out.println("Incorrect answer. Try again!");
   }  if(count ==2){
       System.out.println("Your score is "+ count);
     } else
     System.out.println("Try again to get full points");
     System.out.println("Q2. The java compiler  A] creates executable  B] translates java source to byte code   C] produce java interpreter D] creates classes");
     String Q2ans = TextIO.getln();
        if (Q2ans =="b"){
        count ++;
        System.out.println("Correct answer!");
  }
  return count;
}*/
  }
}
