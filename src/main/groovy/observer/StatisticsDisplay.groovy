package observer

class StatisticsDisplay implements Observer, DisplayElement {

	private maxTemp = 0
	private minTemp = 200
	private tempSum = 0
	private numReadings = 0
	private weatherData
	
	StatisticsDisplay(weatherData){
		this.weatherData = weatherData
		weatherData.registerObserver(this)
	}
	
	@Override
	void display() {
		println "Avg/Max/Min temperature = ${tempSum/numReadings}/$maxTemp/$minTemp"
	}

	@Override
	void update(temperature, humidity, pressure) {
		tempSum += temperature
		numReadings++
		if(temperature > maxTemp) maxTemp = temperature
		if(temperature < minTemp) minTemp = temperature
		display()
	}

}
