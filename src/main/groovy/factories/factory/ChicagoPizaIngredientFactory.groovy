package factories.factory

import factories.ingredients.*;

class ChicagoPizaIngredientFactory implements PizzaIngredientFactory {

	@Override
	Dough createDough() {
		return new ThickCrustDough()
	}

	@Override
	Sauce createSauce() {
		return new PlumTomatoSauce()
	}

	@Override
	Cheese createCheese() {
		return new Mozzarella()
	}

	@Override
	Veggies[] createVeggies() {
		return [new BlackOlives(), new Spinach(), new Eggplant()];
	}

	@Override
	Pepperoni createPepperoni() {
		return new SlicedPepperoni()
	}

	@Override
	Clams createClams() {
		return new FrozenClams()
	}

}
