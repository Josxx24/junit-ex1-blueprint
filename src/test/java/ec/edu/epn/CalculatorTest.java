package ec.edu.epn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    
    private Calculator calculator = new Calculator();

    //Metodo_caso_resultadoEsperado
    @Test
    void add_TwoPositiveNumbers_ReturnCorrectSum(){
        
        //Arrage - Preparación de la prueba
        int a = 3;
        int b = 4;

        //Act
        int result = calculator.add(a, b);

        //Assert
        assertEquals(7, result);

    }

    @Test
    void substract_TwoNumbers_ReturnCorrectSum(){
        
        //Arrage - Preparación de la prueba
        int a = 7;
        int b = 4;

        //Act
        int result = calculator.subtract(a, b);

        //Assert
        assertEquals(3, result);

    }

    @Test
    void multiply_TwoNumbers_ReturnCorrectSum(){
        
        //Arrage - Preparación de la prueba
        int a = 6;
        int b = 4;

        //Act
        int result = calculator.multiply(a, b);

        //Assert
        assertEquals(24, result);

    }

    @Test
    void isEven_Number_ReturnCorrectSum(){
        
        //Arrage - Preparación de la prueba
        int a = 12;

        //Assert
        assertTrue(calculator.isEven(a));
    }

}
