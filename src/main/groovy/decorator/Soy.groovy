package decorator

import groovy.transform.PackageScope;

class Soy extends CondimentDecorator {

	@PackageScope beverage
	
	Soy(beverage){
		this.beverage = beverage
	}
	
	@Override
	String getDescription() {
		// TODO Auto-generated method stub
		return beverage.description + ", Soy";
	}

	@Override
	Number cost() {
		// TODO Auto-generated method stub
		return 0.15+beverage.cost();
	}

}
