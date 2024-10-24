import java.util.Scanner;
public class ArithmeticMeanCalc
{
    /*
        This is the second exercise in the mastering JAVA book.

        Write a program that calculates the mean of two numbers
     */


    public static void main(String[] args)
    {
        //Prompt user for the first number with a scanner
        System.out.println("Please enter the first number: ");
        Scanner scanner = new Scanner(System.in); //Note from looking at answer: You don't need 2 scanners
        double userNum1 = scanner.nextDouble();

        //Prompt user for second number
        System.out.println("Please enter the second number: ");
        Scanner scanner2 = new Scanner(System.in);
        double userNum2 = scanner.nextDouble();

        //Create equation to find the mean of the two numbers
        double sum = userNum1 + userNum2; //Note from looking at answer: Could have simplified using brackets
        double mean = sum / 2;

        //Display results to the user
        System.out.println("Your first number is: " + userNum1);
        System.out.println("Your second number is: " + userNum2);
        System.out.println("The mean of your two numbers: " + mean);

        scanner.close();
        scanner2.close();



    }
}