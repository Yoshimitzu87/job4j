package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {
/**
* Test echo.
*/
@Test
    public void whenTakeNameThenThreeEchoPlusName() {
	String input = "Anton Frolov";
	String expect = "Echo, echo, echo : Anton Frolov";
	
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
	
}
}