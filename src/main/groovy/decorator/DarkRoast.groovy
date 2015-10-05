package decorator

class DarkRoast extends Beverage {

	DarkRoast(){
		description = "Dark Roast"
	}
	
	@Override
	Number cost() {
		return 0.99;
	}

}
