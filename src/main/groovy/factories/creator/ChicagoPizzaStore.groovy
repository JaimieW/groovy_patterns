package factories.creator

import factories.factory.ChicagoPizaIngredientFactory
import factories.product.CheesePizza
import factories.product.ClamPizza
import factories.product.PepperoniPizza
import factories.product.Pizza
import factories.product.VeggiePizza

class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(Object type) {
		Pizza pizza
		def ingredientFactory = new ChicagoPizaIngredientFactory()
		switch(type){
			case "cheese":
				pizza = new CheesePizza(ingredientFactory)
				pizza.name = "Chicago Style Cheese Pizza"
				break
			case "veggie" :
				pizza = new VeggiePizza(ingredientFactory)
				pizza.name = "Chicago Style Veggie Pizza"
				break
			case "clam":
				pizza = new ClamPizza(ingredientFactory)
				pizza.name = "Chicago Style Clam Pizza"
				break
			case "pepperoni":
				pizza = new PepperoniPizza(ingredientFactory)
				pizza.name = "Chicago Style Pepperoni Pizza"
				break
			default:
				throw new Exception("invalid pizza type")
				
		}
		
		
		return pizza;
	}

}
