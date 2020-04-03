import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calculator  {

    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        float firstNumber;
        float secondNumber;



        System.out.println("Write a number");
        String firstNum = in.readLine();


        System.out.println("Write another number");
        String secondNum = in.readLine();

        firstNumber = Float.parseFloat(firstNum);
        secondNumber = Float.parseFloat(secondNum);

        Add(firstNumber, secondNumber);
        Subtract(firstNumber, secondNumber);
        Multiply(firstNumber, secondNumber);
        Divide(firstNumber, secondNumber);

    }
    public static float Add(float firstNumber, float secondNumber){
        System.out.println("Add = " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }

    public static float Subtract( float firstNumber, float secondNumber ) {
        System.out.println("Subtract = " + (firstNumber - secondNumber));
        return firstNumber - secondNumber;
    }

    public static float Multiply( float firstNumber, float secondNumber ) {
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        return firstNumber * secondNumber;
    }
    public static float Divide( float firstNumber, float secondNumber ) {
        System.out.println("Division = " + (firstNumber / secondNumber));
        return firstNumber / secondNumber;
    }
}
