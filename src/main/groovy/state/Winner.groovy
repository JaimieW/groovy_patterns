package state

class Winner implements State {
	def gumballMachine

	@Override
	public void insertQuarter() {
		println "error: unsupported state"
	}

	@Override
	public void ejectQuarter() {
		println "error: unsupported state"
	}

	@Override
	public void turnCrank() {
		println "error: unsupported state"
	}

	@Override
	public void dispense() {
		println "WINNER, you get two for one!!!ZOMG"
		gumballMachine.releaseBall()
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOut())
		} else {
			gumballMachine.releaseBall()
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarter())
			} else {
				println "oops, out of gumballs"
				gumballMachine.setState(gumballMachine.getSoldOut())
			}
		}
	}

	@Override
	String toString() {
		return "winner"
	}
}
