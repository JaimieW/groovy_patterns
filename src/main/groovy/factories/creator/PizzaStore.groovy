package factories.creator

import factories.product.Pizza

abstract class PizzaStore {

	protected abstract Pizza createPizza(type)
	
	Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type)
		println "--- Making a ${pizza.getName()} ---"
		pizza.prepare()
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	
}
