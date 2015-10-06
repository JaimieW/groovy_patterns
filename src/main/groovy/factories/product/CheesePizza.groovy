package factories.product


class CheesePizza extends Pizza {

	def ingredientFactory
	
	CheesePizza(ingredientFactory){
		this.ingredientFactory = ingredientFactory
	}
	
	@Override
	void prepare() {
		println "Preparing $name"
		dough = ingredientFactory.createDough()
		sauce = ingredientFactory.createSauce()
		cheese = ingredientFactory.createCheese()
	}

}
