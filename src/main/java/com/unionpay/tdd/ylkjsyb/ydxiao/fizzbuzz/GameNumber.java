package com.unionpay.tdd.ylkjsyb.ydxiao.fizzbuzz;

public class GameNumber {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public GameNumber(int number) {
		super();
		this.number = number;
	}
	
	public String toString() {
		String res = String.valueOf(number);
		if (isDivisable(3) && isDivisable(5)) {
			res = "FizzBuzz";
		} else if (isDivisable(3)) {
			res = "Fizz";
		} else if (isDivisable(5)) {
			res = "Buzz";
		}
		return res;
	}
	
	private boolean isDivisable(int key) {
<<<<<<< HEAD
		return number % key == 0 | String.valueOf(number).contains(String.valueOf(key));
=======
		return number % key == 0;
>>>>>>> 7fb16bbacf9edf9301ebcdc6dad8b171562cc8a4
	}
}
