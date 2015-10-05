package observer

class ForecastDisplay implements Observer, DisplayElement {

	private currentPressure = 29.92
	private lastPressure
	private weatherData
	
	ForecastDisplay(weatherData){
		this.weatherData = weatherData
		weatherData.registerObserver(this)
	}
	
	@Override
	void display() {
		print "Forecast: "
		if(currentPressure > lastPressure) println "Improving weather on the way"
		else if(currentPressure == lastPressure) println "More of the same"
		else if(currentPressure < lastPressure) println "Watch out for cooler, rainy weather"
	}

	@Override
	void update(temperature, humidity, pressure) {
		lastPressure = currentPressure
		currentPressure = pressure
		display()
	}

}
