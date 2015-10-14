package command

class CeilingFan {
	
	enum Speed {
		HIGH("high", 3), 
		MEDIUM("medium", 2), 
		LOW("low", 1), 
		OFF("off", 0)
		
		private def text
		private def value
		Speed(text, value) {
			this.text = text
			this.value = value
		}
		
		
	}
	
	def room
	def speed
	CeilingFan(room){
		this.room = room
		speed = Speed.OFF
	}
	void high() {
		speed = Speed.HIGH
		println toString()
	}
	void medium() {
		speed = Speed.MEDIUM
		println toString()
	}
	void low() {
		speed = Speed.LOW
		println toString()
	}
	void off() {
		speed = Speed.OFF
		println toString()
	}
	String toString() { return "$room fan is ${speed.text}"}
}
