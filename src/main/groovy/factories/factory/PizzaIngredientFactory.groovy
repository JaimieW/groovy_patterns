package factories.factory

import factories.ingredients.*

interface PizzaIngredientFactory {

	Dough createDough()
	Sauce createSauce()
	Cheese createCheese()
	Veggies[] createVeggies()
	Pepperoni createPepperoni()
	Clams createClams()
}
