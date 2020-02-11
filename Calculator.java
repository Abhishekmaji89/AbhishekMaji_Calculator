import java.util.Scanner;


public class Calculator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = sc.nextInt();
        System.out.println();


        if (choice == 1){
            addition();
        }
        else if (choice == 2){
            subtraction();
        }
        else if (choice == 3){
            division();
        }
        else if (choice == 4){
            multiplication();
        }
		System.out.println();
        sc.close();
    }
	private static int[] getNumbers()
	{
       int[] numbers = new int[2];
	   Scanner sc=new Scanner(System.in);
        System.out.print("\nFirst Number: ");
       numbers[0] = sc.nextInt();
        System.out.print("\nSecond Number: ");
       numbers[1] = sc.nextInt();
       return numbers;
    }

    public static void addition()
	{   
        int n[]=getNumbers();
       
        System.out.println("\nSum: " + n[0] + " + " + n[1] + " = " + (n[0] + n[1]));
    }

    public static void subtraction()
	{
     
      int n[]=getNumbers();
       
        System.out.println("\nSubstraction: " + n[0] + " - " + n[1] + " = " + (n[0] - n[1]));
    }

    public static void division(){
        
        System.out.println("Division");

     int n[]=getNumbers();
        
        System.out.println("\nDivision: " + n[0] + " / " + n[1] + " = " + (n[0] / n[1]));
    }

    public static void multiplication(){
        
        int n[]=getNumbers();
       
        System.out.println("\nMultiplication: " + n[0] + " x " + n[1] + " = " + (n[0] * n[1]));
    }
}