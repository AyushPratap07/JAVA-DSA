import java.util.*;
class First{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter first number : ");
      int a=sc.nextInt();
      System.out.print("Enter second number : ");
      int b=sc.nextInt();
      System.out.print("Enter operation(+,-,*,/) : ");
      String c=sc.next();
      switch (c) {
        case "+" : System.out.println(a+b);
        break;
        case "-" : System.out.println(a-b);
        break;
        case "*" : System.out.println(a*b);
        break;
        case "/" : System.out.println(a/b);
        break;
        default : System.out.println("Invalid operator");
      }
    }
}