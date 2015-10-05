package factories.product

class ClamPizza extends Pizza {

	def ingredientFactory
	
	ClamPizza(factory){
		this.ingredientFactory = factory
	}
	
	@Override
	public void prepare() {
		println "Preparing $name"
		dough = ingredientFactory.createDough()
		sauce = ingredientFactory.createSauce()
		cheese = ingredientFactory.createCheese()
		clams = ingredientFactory.createClams()
	}

}
