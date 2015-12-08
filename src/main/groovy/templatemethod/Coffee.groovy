package templatemethod

class Coffee extends HotBeverage {

	@Override
	void brew() {
		println "dripping coffee through filter"
	}

	@Override
	void addCondiments() {
		println "adding sugar and milk"
	}

}
