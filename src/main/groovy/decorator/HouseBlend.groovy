package decorator

class HouseBlend extends Beverage {

	HouseBlend(){
		description = "House Blend Coffee"
	}
	
	@Override
	Number cost() {
		return 0.89;
	}

}
