package state

class HasQuarter implements State {
	Random randomWinner = new Random(System.currentTimeMillis())
	def gumballMachine
	
	@Override
	public void insertQuarter() {
		println "you cannot insert another quarter"
	}

	@Override
	public void ejectQuarter() {
		println "quarter returned"
		gumballMachine.setState(gumballMachine.getNoQuarter())
	}

	@Override
	public void turnCrank() {
		println "you turned..."
		def winner = randomWinner.nextInt(10)
		if(winner == 10 && gumballMachine.getCount() > 1) {
			gumballMachine.setState(gumballMachine.getWinner())
		} else {
			gumballMachine.setState(gumballMachine.getSold())
		}
	}

	@Override
	public void dispense() {
		println "no gumball dispensed"
	}
	
	@Override
	String toString() {
		return "has quarter"
	}
}
