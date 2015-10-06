package factories.creator

import factories.product.Pizza

abstract class PizzaStore {

	protected abstract Pizza createPizza(type)
}
