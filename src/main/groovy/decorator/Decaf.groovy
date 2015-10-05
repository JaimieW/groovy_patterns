package decorator

class Decaf extends Beverage {

	Decaf(){
		description = "Decafinated"
	}
	
	@Override
	public Number cost() {
		return 1.05;
	}

}
