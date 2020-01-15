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
<<<<<<< HEAD
		isEquals("Fizz" , 31);
=======
>>>>>>> 7fb16bbacf9edf9301ebcdc6dad8b171562cc8a4
	}
	
	@Test
	public void should_show_Buzz_test() {
		isEquals("Buzz" , 5);
<<<<<<< HEAD
		isEquals("Buzz" , 52);
=======
>>>>>>> 7fb16bbacf9edf9301ebcdc6dad8b171562cc8a4
	}
	
	@Test
	public void should_show_fizzbuzz_test() {
		isEquals("FizzBuzz" , 15);
<<<<<<< HEAD
		isEquals("FizzBuzz" , 35);
=======
>>>>>>> 7fb16bbacf9edf9301ebcdc6dad8b171562cc8a4
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
