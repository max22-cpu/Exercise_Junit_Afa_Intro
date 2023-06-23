package org.example.rechnungswesen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfaCalculatorTest {

    private   AfaCalculator calculator = new AfaCalculator();

    @Test
    void calculate() {

        float result = calculator.calculate(10000.0F,5,false);

        assertEquals(2000.0F,result);


    }

    @Test
    void calculateHalbjahres(){

        float result = calculator.calculate(10000.0F,5,true);
        assertEquals(1000.0F,result);

    }
    @Test
void  invalidValues(){

        assertThrows(IllegalArgumentException.class,() ->{
            calculator.calculate(-0.001F,5,false);
        }
        );

    assertThrows(IllegalArgumentException.class,() ->{
        calculator.calculate(10000.0F,0,true);
            }
    );

}
@Test
void geringwertigesWirtschaftsgut(){
    float result = calculator.calculate(1000.0F,1,false);
    assertEquals(1000.0F,result);
}


}
