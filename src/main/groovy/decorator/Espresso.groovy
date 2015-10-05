package decorator

class Espresso extends Beverage {

	Espresso(){
		description = "Espresso"
	}
	
	@Override
	Number cost() {
		return 1.99;
	}

}
