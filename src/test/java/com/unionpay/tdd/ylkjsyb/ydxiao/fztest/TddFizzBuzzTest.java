package com.unionpay.tdd.ylkjsyb.ydxiao.fztest;
import static org.junit.Assert.*;

import org.junit.Test;

import com.unionpay.tdd.ylkjsyb.ydxiao.fizzbuzz.GameNumber;

/**
 * 
 * @author xiaoyingdong
 *
 */
public class TddFizzBuzzTest {

	
	@Test
	public void should_show_fizz_test() {
		isEquals("Fizz" , 3);
	}
	
	@Test
	public void should_show_Buzz_test() {
		isEquals("Buzz" , 5);
	}
	
	@Test
	public void should_show_fizzbuzz_test() {
		isEquals("FizzBuzz" , 15);
	}
	
	@Test
	public void should_show_nor_test() {
		isEquals("22" , 22);
	}
	
	private void isEquals(String expected, int input) {
		GameNumber gameNumber = new GameNumber(input);
		assertEquals(expected, gameNumber.toString());
	}
	
}
