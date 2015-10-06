package factories.product

import groovy.transform.ToString;

@ToString
abstract class Pizza {

	String name
	def dough
	def sauce
	def veggies = []
	def cheese
	def pepperoni
	def clams
	
	abstract void prepare()
		
	
	void bake(){ println "Bake for 25 mins at 350" }
	void cut(){ println "Cutting the pizza into diagonal slices" }
	void box(){ println "Place pizza into the box" }

//	String toString(){ 
//		return this.name+ " pizza ( "+
//				this.dough?:"" +", "+
//				this.sauce?:"" +", "+
//				this.veggies?:""+", "+
//				this.cheese?:""+", "+
//				this.pepperoni?:""+", "+
//				this.clams?:""+" )"}	
}
