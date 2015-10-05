package observer

class CurrentConditionsDisplay implements Observer, DisplayElement {

	private temperature
	private humidity
	private weatherData
	
	CurrentConditionsDisplay(weatherData){
		this.weatherData = weatherData
		weatherData.registerObserver(this)
	}
	
	@Override
	public void display() {
		println "current conditions: ${temperature}F degrees and ${humidity}% humidity"
	}

	@Override
	public void update(temperature, humidity, pressure) {
		this.temperature = temperature
		this.humidity = humidity
		display()
	}

}
