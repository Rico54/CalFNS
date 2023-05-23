package tests;

import calculator.model.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCalculator {
        private final double EPSILON = .001;

        public void compareDoubles(double d1, double d2){
            assertTrue(d1+" and "+d2+" are not within " +EPSILON,Math.abs(d1-d2)<EPSILON);
        }
        @Test
        public void testSimpleCalculator() {
            Calculator testing = new Calculator();
            testing.numberPressed(1);
            double expected = 1.0;
            double computed = testing.displayNumber();
            compareDoubles(expected,computed);
            testing.numberPressed(2);
            expected = 12.0;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
        }

        @Test
        public void testAddCalculator() {
            Calculator testing = new Calculator();
            testing.numberPressed(1);
            testing.numberPressed(1);
            testing.addPressed();
            testing.numberPressed(9);
            double expected = 20.0;
            testing.equalsPressed();
            double computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.dividePressed();
            testing.numberPressed(5);
            testing.equalsPressed();
            expected = 4.0;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);

        }
        @Test
    public void testSubtractCalculator(){
            Calculator testing = new Calculator();
            testing.numberPressed(1);
            testing.numberPressed(2);
            testing.subtractPressed();
            testing.numberPressed(9);
            double expected = 3.0;
            testing.equalsPressed();
            double computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.multiplyPressed();
            testing.numberPressed(3);
            testing.equalsPressed();
            expected = 9.0;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
        }
        @Test
    public void testDivideCalculator(){
            Calculator testing = new Calculator();
            testing.numberPressed(2);
            testing.numberPressed(2);
            testing.dividePressed();
            testing.numberPressed(1);
            testing.numberPressed(1);
            testing.equalsPressed();
            double expected = 2.0;
            double computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.addPressed();
            testing.numberPressed(5);
            testing.numberPressed(2);
            testing.equalsPressed();
            expected = 54.0;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
        }

        @Test
    public void testMultiplyCalculator(){
            Calculator testing = new Calculator();
            testing.numberPressed(3);
            testing.multiplyPressed();
            testing.numberPressed(1);
            testing.numberPressed(0);
            testing.equalsPressed();
            double expected = 30.0;
            double computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.subtractPressed();
            testing.numberPressed(1);
            testing.numberPressed(0);
            testing.equalsPressed();
            expected = 20.0;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);

        }
        @Test
        public void testClear(){
            Calculator testing = new Calculator();
            double expected = 0.0;
            double computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.numberPressed(2);
            testing.decimalPressed();
            testing.decimalPressed();
            testing.numberPressed(5);
            expected = 2.5;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.clearPressed();
            expected = 0.0;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
        }
        @Test
    public void testManyEquals(){
            Calculator testing = new Calculator();
            testing.numberPressed(3);
            testing.multiplyPressed();
            testing.numberPressed(2);
            testing.equalsPressed();
            double expected = 6.0;
            double computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.equalsPressed();
            expected = 12.0;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.equalsPressed();
            expected = 24.0;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
        }

        @Test
    public void testJessesTest(){
            Calculator testing = new Calculator();
            double expected = 0.0;
            double computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.numberPressed(1);
            testing.numberPressed(2);
            testing.decimalPressed();
            testing.numberPressed(5);
            expected = 12.5;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.decimalPressed();
            testing.decimalPressed();
            testing.numberPressed(0);
            expected = 12.50;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
            testing.decimalPressed();
            testing.numberPressed(5);
            expected = 12.505;
            computed = testing.displayNumber();
            compareDoubles(expected, computed);
        }




}

