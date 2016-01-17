package state

class NoQuarter implements State {

	def gumballMachine
	
	@Override
	public void insertQuarter() {
		println "you inserted a quarter"
		gumballMachine.setState(gumballMachine.getHasQuarter())
	}

	@Override
	public void ejectQuarter() {
		println "you haven't inserted a quarter"
	}

	@Override
	public void turnCrank() {
		println "you turned but theres no quarter"
	}

	@Override
	public void dispense() {
		println "you need to pay first"
	}

	@Override
	String toString() {
		return "no quarter"
	}
}
