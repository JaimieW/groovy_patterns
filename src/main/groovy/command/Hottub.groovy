package command

class Hottub {
	def on
	def temp
	
	void on() { on = true ; println "hot tub is on"}
	void off() { on = false; println "hot tub is off" }
	void circulate() {if(on)println "hot tub is bubbling"}
	void jetsOn() {if(on)println "hot tub jets are on"}
	void jetsOff() {if(on)println "hot tub jets are off"}
	void setTemperature(temp) {
		if (temp > this.temp) {
			println "hot tub is heating to a steaming $temp degrees"
		} else {
			println "hot tub is cooling to $temp degrees"
		}
		this.temp = temp
	}	
}
