package factories.creator

import factories.factory.NYPizzaIngredientFactory
import factories.product.*

class NYPizzaStore extends PizzaStore {

	
	@Override
	protected Pizza createPizza(type) {
		Pizza pizza
		def ingredientFactory = new NYPizzaIngredientFactory()
		switch(type){
			case "cheese":
				pizza = new CheesePizza(ingredientFactory)
				pizza.name = "New York Style Cheese Pizza"
				break
			case "veggie" :
				pizza = new VeggiePizza(ingredientFactory)
				pizza.name = "New York Style Veggie Pizza"
				break
			case "clam":
				pizza = new ClamPizza(ingredientFactory)
				pizza.name = "New York Style Clam Pizza"
				break
			case "pepperoni":
				pizza = new PepperoniPizza(ingredientFactory)
				pizza.name = "New York Style Pepperoni Pizza"
				break
			default:
				throw new Exception("invalid pizza type")
				
		}
		
		
		return pizza;
	}

}
