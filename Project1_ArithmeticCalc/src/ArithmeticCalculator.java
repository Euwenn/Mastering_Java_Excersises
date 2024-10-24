import java.util.Scanner;
/*
User: Euwen Meredith
Date: October 22nd 2024
 */
public class ArithmeticCalculator
{
    //Write a program that prompts the user two nums and displays the -
    //Addition, Subtraction, Multiplication, and Division between them.
    public static void main(String[] args)
    {
        //Create a scanner to prompt the user for the first number
        System.out.println("Please enter the first number: ");
        Scanner scan = new Scanner(System.in);




        //Store the users number
        double userNum1 = scan.nextDouble();

        //Create a scanner to prompt the user for the second number
        System.out.println("Please enter a second number: ");
        Scanner scan2 = new Scanner(System.in);

        //Store the users number
        double userNum2 = scan2.nextDouble();

        //Create formula's for each calculation
        //Addition
        double add = userNum1 + userNum2;

        //Subtraction
        double sub = userNum1 - userNum2;

        //Multiplication
        double mul = userNum1 * userNum2;

        //Division
        double div = userNum1 / userNum2;

        //BONUS Remainder
        double modulo = userNum1 % userNum2;

        //Display Results to user
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("BONUS - Modulo/Remainder: " + modulo);
    }
}
