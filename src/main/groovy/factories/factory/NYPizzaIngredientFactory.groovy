package factories.factory

import factories.ingredients.*

class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	Dough createDough() {
		return new ThinCrustDough()
	}

	@Override
	Sauce createSauce() {
		return new MarinaraSauce()
	}

	@Override
	Cheese createCheese() {
		return new ReggianoCheese()
	}

	@Override
	Veggies[] createVeggies() {
		return [new Garlic(), new Onion(), new Mushroom(),new RedPepper()]
	}

	@Override
	Pepperoni createPepperoni() {
		return new SlicedPepperoni()
	}

	@Override
	Clams createClams() {
		return new FreshClams()
	}

}
