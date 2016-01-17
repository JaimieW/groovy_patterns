package state

class SoldOut implements State {
	
	def gumballMachine
	
	@Override
	public void insertQuarter() {
		println "You can't insert a quarter, the machine is sold out"
	}

	@Override
	public void ejectQuarter() {
		println "You can't eject, you haven't inserted a quarter yet"
	}

	@Override
	public void turnCrank() {
		println "You turned, but there are no gumballs"
	}

	@Override
	public void dispense() {
		println "No gumball dispensed"
	}

	@Override
	String toString() {
		return "sold out"
	}
}
