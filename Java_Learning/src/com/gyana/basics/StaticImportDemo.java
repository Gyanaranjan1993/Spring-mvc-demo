package com.gyana.basics;

import static com.gyana.basics.Config.display;
import static java.lang.Math.min;

/* Static import which will remove use of object while calling the methods or variables. e.g. if we import Math class statically
 * then we can use the static methods and variables without using the object  */

public class StaticImportDemo {
	public static void main(String[] args) {
		int x = min(5, 6);
		System.out.println(x);
		display();

		boolean b = new Boolean("TRUE");
	}

}
