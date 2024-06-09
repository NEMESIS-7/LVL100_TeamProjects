import java.util.*;
public class Inheritanc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        vAdvCalc calc = new vAdvCalc();         //instantiating an object of the baseCalc class
        System.out.println("enter two numbers: ");
        int num1 = input.nextInt();             //storing input to variables
        int num2 = input.nextInt();
        System.out.println("the sum of two numbers is: " + calc.add(num1, num2));              //calling the add method

        System.out.println("the difference of two numbers is: " + calc.sub(num1, num2));       //calling the sub method

        System.out.println("the greater of the two numbers is: " + calc.min(num1, num2));      //calling the min method

        System.out.println("the product of the numbers is: " + calc.multiply(num1, num2));     //calling the multiply method

        System.out.println(num1 + " divided by " + num2 + " is: " + calc.divide(num1, num2));  //calling the divide method

        System.out.println(num1 + " exponent " + num2 + " is " + calc.power(num1, num2));      //power method

        System.out.println("enter a number: ");
        int num3 = input.nextInt();
        System.out.println("the absolute value of " + num3 + " is: " + calc.absolutes(num3));  //calling the absolutes method



    }
}