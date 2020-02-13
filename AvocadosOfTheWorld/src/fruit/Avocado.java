/*
 * David Hollins
 * holliindv@mail.uc.edu
 * 
 */
package fruit; 
/***
 * Model an Avocado at Meijer in the Produce Department
 * @author nicomp
 *
 */
public class Avocado extends Fruit {
	//Add a copy constructor, By definition, a Copy Constructor takes as a parameter... an object of the same type
	public Avocado(Avocado avocado) {
		super(avocado.getWeight(), avocado.getCost());
		//Copy all the properties from the parameter to the object. In this case there are none
	}
	
	public Avocado(int weight, float cost) {
		//"super" means the base class
		super(weight, cost); //Pass the weight and cost to the base class constructor
	}
}
