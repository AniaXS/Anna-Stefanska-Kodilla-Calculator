package com.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class CalculatorApplicationTests {

    @Test
    public void addOperationShouldReturnProperResult() {

        Calculator calculator = new Calculator();
        int result = calculator.add(250, 1000);
        Assert.assertEquals(1250, result);
    }

    @Test
    public void subtractOperationShouldReturnProperResult() {

        Calculator calculator = new Calculator();
        int result = calculator.subtract(250, 1000);
        Assert.assertEquals(750, result);
    }

}

