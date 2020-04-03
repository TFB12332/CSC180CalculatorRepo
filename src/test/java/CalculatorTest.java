import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void add() {
        float firstNum = 12;
        float secondNum = 12;
        //arrange
        Calculator calculator = new Calculator();
        float expectedResult = 24;
        //act
        float actualResult = calculator.Add(firstNum, secondNum);

        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void subtract() {
        float firstNum = 12;
        float secondNum = 12;
        //arrange
        Calculator calculator = new Calculator();
        float expectedResult = 0;
        //act
        float actualResult = calculator.Subtract(firstNum, secondNum);

        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void multiply() {

        float firstNum = 12;
        float secondNum = 12;
        //arrange
        Calculator calculator = new Calculator();
        float expectedResult = 144;
        //act
        float actualResult = calculator.Multiply(firstNum, secondNum);

        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void divide() {

        float firstNum = 12;
        float secondNum = 12;
        //arrange
        Calculator calculator = new Calculator();
        float expectedResult = 1;
        //act
        float actualResult = calculator.Divide(firstNum, secondNum);

        //assert
        assertEquals(expectedResult,actualResult);

    }
}