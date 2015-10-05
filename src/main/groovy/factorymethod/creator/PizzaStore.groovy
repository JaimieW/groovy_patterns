package factorymethod.creator

import factorymethod.product.Pizza

abstract class PizzaStore {

	protected abstract Pizza createPizza(type)
}
