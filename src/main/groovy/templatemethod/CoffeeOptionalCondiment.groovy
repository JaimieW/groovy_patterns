package templatemethod

class CoffeeOptionalCondiment extends HotBeverage {

	@Override
	void brew() {
		println "making doible espresso Americano"
	}

	@Override
	void addCondiments() {
		println "add milk and sugar"
	}
	
	@Override
	boolean wantsCondiments() {
		def answer = getUserInput()
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		println "do you want milk and sugar (y/n)?"
		def input = System.in.newReader().readLine()
		return input ?: "no"
	}

}
