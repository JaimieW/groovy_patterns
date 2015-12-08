package templatemethod

class Tea extends HotBeverage {

	@Override
	void brew() {
		println "steeping the tea"
	}

	@Override
	void addCondiments() {
		println "adding lemon"
	}

}
