package command

class CeilingFan {
	def room
	def speed
	CeilingFan(room){this.room = room}
	void high() {
		speed = "high"
		println toString()
	}
	void medium() {
		speed = "medium"
		println toString()
	}
	void low() {
		speed = "low"
		println toString()
	}
	void off() {
		speed = "off"
		println toString()
	}
	String toString() { return "$room fan is $speed"}
}
