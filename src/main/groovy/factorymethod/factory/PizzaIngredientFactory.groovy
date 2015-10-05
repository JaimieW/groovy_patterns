package factorymethod.factory

import factorymethod.ingredients.*

interface PizzaIngredientFactory {

	Dough createDough()
	Sauce createSauce()
	Cheese createCheese()
	Veggies[] createVeggies()
	Pepperoni createperpperoni()
	Clams createClams()
}
