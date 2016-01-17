package state

class Sold implements State {
	def gumballMachine
	
	@Override
	public void insertQuarter() {
		println "please wait"
	}

	@Override
	public void ejectQuarter() {
		println "sorry, you turned the crank"
	}

	@Override
	public void turnCrank() {
		println "already turned crank"
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall()
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarter())
		} else {
			println "oops, out of stock"
			gumballMachine.setState(gumballMachine.getSoldOut())
		}
	}

	@Override
	String toString() {
		return "sold"
	}
}
