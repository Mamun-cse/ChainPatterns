package Chainofresponsibility;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit {

	@Test
	public void test() {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		assertEquals("5.0",5.0,chainCalc1.calculate(new Numbers(3.0,2.0,"add")));
		assertEquals("1.0",chainCalc1.calculate(new Numbers(3.0,2.0,"sub")));
		assertEquals("6.0",chainCalc1.calculate(new Numbers(3.0,2.0,"mult")));
		assertEquals("1.0",chainCalc1.calculate(new Numbers(3.0,2.0,"divid")));
		
	}



}
