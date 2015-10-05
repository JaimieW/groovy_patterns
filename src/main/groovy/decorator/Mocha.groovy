package decorator

import groovy.transform.PackageScope;

class Mocha extends CondimentDecorator {

	@PackageScope beverage
	
	Mocha(beverage){
		this.beverage = beverage
	}
	
	@Override
	String getDescription() {
		// TODO Auto-generated method stub
		return beverage.description + ", Mocha";
	}

	@Override
	Number cost() {
		// TODO Auto-generated method stub
		return 0.2 + beverage.cost();
	}

}
