import java.util.*;
public class Leapyear {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the year to check whether it's a Leap year or not");
            int y=sc.nextInt();
            if (y%4==0){
                if (y%100==0){
                    if (y%400==0){
                        System.out.println("LEAP YEAR");
                    }
                    else{
                        System.out.println("NOT A LEAP YEAR");
                    }   
                }
                else{
                    System.out.println("LEAP YEAR");
                }
            }
            else{
                System.out.println("NOT A LEAP YEAR");
            }
        }
}
/*import java.util.*;
public class Leapyear1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Input the year: ");
int year = sc.nextInt();
boolean x = (year % 4) == 0;
boolean y = (year % 100) != 0;
boolean z = ((year % 100 == 0) && (year % 400 == 0));
if (x && (y || z)) {
System.out.println(year + " is a leap year");
} else {
System.out.println(year + " is not a leap year");
}
}
}
*/