package composite

class MenuItem extends MenuComponent {
	def name
	def description
	def vegetarian
	def price


	@Override
	def getName() {
		return name;
	}

	@Override
	def getDescription() {
		return description;
	}

	@Override
	def isVegetarian() {
		return vegetarian;
	}

	@Override
	def getPrice() {
		return price;
	}

	@Override
	void print() {
		print "$name "
		if(vegetarian)print "(v)"
		println ", $price"
		println "\t-- $description"
	}
	
	@Override def createIterator() { return new NullIterator() }
}
