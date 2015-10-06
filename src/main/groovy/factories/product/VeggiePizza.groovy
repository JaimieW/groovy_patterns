package factories.product

class VeggiePizza extends Pizza {

	def ingredientFactory
	
	VeggiePizza(factory){
		this.ingredientFactory = factory
	}
	
	@Override
	public void prepare() {
		println "Preparing $name"
		dough = ingredientFactory.createDough()
		sauce = ingredientFactory.createSauce()
		cheese = ingredientFactory.createCheese()
		veggies = ingredientFactory.createVeggies()
	}

}
