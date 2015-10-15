package adapter

class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		println "Gobble gobble"
	}

	@Override
	public void fly() {
		println "Wild turkey only flies a short distance"
	}

}
