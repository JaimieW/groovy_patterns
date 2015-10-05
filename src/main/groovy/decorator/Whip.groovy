package decorator

import groovy.transform.PackageScope;

class Whip extends CondimentDecorator {

	@PackageScope beverage
	
	Whip(beverage){
		this.beverage = beverage
	}
	
	@Override
	String getDescription() {
		return beverage.description + ", Whip";
	}

	@Override
	Number cost() {
		return 0.1+beverage.cost();
	}

}
