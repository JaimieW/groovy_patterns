package observer

weatherData = new WeatherData()
currentDisplay = new CurrentConditionsDisplay(weatherData)
statsDisplay = new StatisticsDisplay(weatherData)
forecastDislay = new ForecastDisplay(weatherData)

weatherData.setMeasurements(80, 65, 30.4)
weatherData.setMeasurements(82, 70, 29.2)
weatherData.setMeasurements(78, 90, 29.2)
