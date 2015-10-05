package observer

class WeatherData implements Subject {
	
	private observers = []
	private temperature
	private humidity
	private pressure

	@Override
	void registerObserver(Observer o) {
		observers.add(o)
	}

	@Override
	void removeObserver(Observer o) {
		observers.remove(o)
	}

	@Override
	void notifyObservers() {
		observers.each {it.update(temperature, humidity, pressure)}
	}
	
	void measurementsChanged(){
		notifyObservers()
	}

	void setMeasurements(temperature, humidity, pressure){
		this.temperature = temperature
		this.humidity = humidity
		this.pressure = pressure
		measurementsChanged()
	}
}
