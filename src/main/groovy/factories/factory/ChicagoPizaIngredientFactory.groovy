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
		// TODO Auto-generated method stub
		return [new BlackOlives(), new Spinach(), new Eggplant()];
	}

	@Override
	Pepperoni createperpperoni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Clams createClams() {
		return new FrozenClams()
	}

}
