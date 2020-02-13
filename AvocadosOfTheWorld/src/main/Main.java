/*
 * David Hollins
 * hollindv@mail.uc.edu
 * 
 */
package main;

import fruit.Fruit;
import fruit.Avocado; 
import bin.Bin;

public class Main {

	public static void main(String[] args) {
		//Declare and instantiate a fruit called Avocajoe
		//Fruit avocajoe = new Fruit(); //Cannot instantiate an abstract class. Be able to explain why we have abstract classes
		
		//Declare and instantiate an avocado named avocajoe
		Avocado avocajoe = new Avocado(6, (float).50);
		
		
		//Declare and instantiate a Bin object
		Bin box = new Bin(avocajoe);
		//Add 50 avocados to the bin
		for(int i = 0; i == 50; i++) {
			box.addAvocado(new Avocado(6, (float).50));
		}

	}
}
