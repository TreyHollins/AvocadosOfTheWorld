/*
 * David Hollins
 * hollindv@mail.uc.edu
 * 
 */

package fruit; 
/***
 * An Abstract class upon which we will build fruits
 * @author nicomp
 *
 */
public abstract class Fruit {
	private int weight; //in ounces
	private float cost;
	
	/***
	 * Constructor
	 * @param weight Weight of the fruit
	 * @param cost Cost of the fruit
	 */
	public Fruit(int weight, float cost) {
		setWeight(weight);
		setCost(cost);
	}
	/***
	 * Get the weight 
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}
	/***
	 * Define the weight
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/***
	 * Get the cost
	 * @return cost
	 */
	public float getCost() {
		return cost;
	}
	/***
	 * Define the cost
	 * @param cost
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String toString() {
		return "The fruit has a weight of " + weight + " and a cost of " + cost;
	}
}
