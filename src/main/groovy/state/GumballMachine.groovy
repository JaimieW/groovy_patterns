package state

class GumballMachine {
	def noQuarter
	def soldOut
	def hasQuarter
	def sold
	def winner
	
	def state = soldOut
	
	def count = 0
	
	GumballMachine(numberOfGumballs) {
		soldOut = new SoldOut(gumballMachine: this)
		noQuarter = new NoQuarter(gumballMachine: this)
		hasQuarter = new HasQuarter(gumballMachine: this)
		sold = new Sold(gumballMachine: this)
		count = numberOfGumballs
		if(numberOfGumballs > 0) state = noQuarter
	}
	
	void insertQuarter() {
		state.insertQuarter()
	}
	void ejectQuarter() {
		state.ejectQuarter()
	}
	void turnCrank() {
		state.turnCrank()
		state.dispense()
	}
	void releaseBall() {
		println "a gumball comes out of the slot"
		if(count != 0) count--
	}
	
	// lifted from example java code - cos its late and I can't be arsed implementing this
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
	
}
