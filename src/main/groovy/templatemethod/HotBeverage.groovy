package templatemethod

abstract class HotBeverage {

	final void prepareRecipe() {
		boilWater()
		brew()
		pourInCup()
		addCondiments()
	}
	
	abstract void brew()
	abstract void addCondiments()
	void boilWater() {
		println "boiling water"
	}
	void pourInCup() {
		println "pouring into cup"
	}
}
