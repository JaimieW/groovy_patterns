package factories.product

class PepperoniPizza extends Pizza {

	def ingredientFactory
	
	PepperoniPizza(factory){
		this.ingredientFactory = factory
	}
	
	@Override
	public void prepare() {
		println "Preparing $name"
		dough = ingredientFactory.createDough()
		sauce = ingredientFactory.createSauce()
		cheese = ingredientFactory.createCheese()
		veggies = ingredientFactory.createVeggies()
		pepperoni = ingredientFactory.createPepperoni()
	}

}
