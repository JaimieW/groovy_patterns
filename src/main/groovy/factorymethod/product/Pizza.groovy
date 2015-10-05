package factorymethod.product

abstract class Pizza {

	def name
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

	String toString(){ println "$name pizza"}	
}
