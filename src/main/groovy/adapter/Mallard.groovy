package adapter

class Mallard implements Duck {

	@Override
	public void quack() {
		println "Quack"
	}

	@Override
	public void fly() {
		println "Mallard duck is flying"
	}

}
