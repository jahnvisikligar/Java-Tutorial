import java.util.*;
import java.io.*;
public class Ch2QnA{
	public static void main(String args[]){
	//Q1();
	//Q2();
	//Q3();
	//Q4();
	//Q5();
	Q6();
	}
//answer to question1 - understanding the print fucntion
	static void Q1(){
	System.out.println("   **********   **********   ");  //1
	System.out.println("       **       **           ");  //2
	System.out.println("       **       **           ");  //3	
	System.out.println("       **       **           ");  //4
	System.out.println("       **       **********   ");  //5
	System.out.println("       **               **   ");  //6
	System.out.println("    *  **               **   ");  //7
	System.out.println("    *  **               **   ");  //8
	System.out.println("    *****       **********   ");  //9
	}
//answer to question2 - understanding mathematical operators using .randon func
	static void Q2(){
	int a = (int)(Math.random()*6)+1;
	int b = (int)(Math.random()*6)+1;
	int c = a+b;
	System.out.println("Roll of fisrt dice: "  + a);
	System.out.println("Roll of second dice: " + b);
	System.out.println("Sum of 2 dice: " + c);
	}	
  //answer to question3 - working of Uppercase func
	static void Q3(){
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter the string");
	String str = s.nextLine();
	String upper_case=str.toUpperCase(); //converting input string to uppercase
	System.out.println("Hello " + upper_case);
	}
 //answer to question4 - creating a money calculator
 	static void Q4(){
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the quantity of quarters");
 	int qtr = sc.nextInt();
 	System.out.println("Enter the quantity of dimes");
 	int dimes = sc.nextInt();
	System.out.println("Enter the quantity of nickels");
 	int nkl = sc.nextInt();
 	double total;
 	total = (0.25 * qtr) + (0.10 * dimes) + (0.05 * nkl);                           //computing the total amount of money the user has in total
 	System.out.println("Total money you have is $" + String.format("%.2f",total));  //printing the money the user has in total 	
 	System.out.printf("Total money you have is $ %2.f", total);                     //printing the money the user has in total 	
 	}
 //answer to question5 - understand the working of '/' and '%' operators
 	static void Q5(){
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the number of eggs in your bag");
 	int N = sc.nextInt();
 	int dozen, gross, lo, after_gross;
 	gross=N/144;                                                                                                  //computing gross number of eggs
 	after_gross= N%144;                                                                                           //computing leftover eggs after gross
 	dozen=(after_gross)/12;                                                                                       //computing dozen eggs with the rest
 	lo=(after_gross)%12;                                                                                          //computing leftover eggs 
 	System.out.println("You have " + gross + " gross " + dozen + " dozen " + lo + " leftover eggs in your bag."); //printing the dozen and leftover eggs of the bag
 	}
 //answer to question6
 	static void Q6(){
 	
 	
 	
 	
 	
 	
 	
 	
 	}	
	
}
